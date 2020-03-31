package iwms.spring_wechat.util;

import com.alibaba.fastjson.JSONObject;

import iwms.spring_wechat.entity.AccessToken;
import iwms.spring_wechat.entity.Config;


public class GetAccessToken {
    public static String appId = Config.APP_ID;
    public static String appSecret = Config.APP_SECRET;
    public static final String get_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    private static AccessToken at;
    private static void getToken(){
        String url = get_token_url.replace("APPID", appId).replace("APPSECRET", appSecret);
        JSONObject jsonObject = HttpClient.doGetstr(url);
        System.out.println(jsonObject);
        String token = jsonObject.getString("access_token");

        String expireIn = jsonObject.getString("expires_in");

        at = new AccessToken(token, expireIn);
    }
    public static String getAccessToken() {
        if(at==null||at.isExpired()) { //判断是否存在access_token以及token值是否过期
            getToken();
        }
        return at.getAccessToken();
    }
}
