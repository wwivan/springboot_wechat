package iwms.spring_wechat.util;

import com.alibaba.fastjson.JSONObject;
import iwms.spring_wechat.entity.Config;


public class GetUserInfo {
    /**
     * 通过code获取用户信息
     * @param code
     * @return
     */
    public JSONObject getUserInfoByCode(String code){
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
        url = url.replace("APPID", Config.APP_ID).replace("SECRET", Config.APP_SECRET).replace("CODE", code);
        JSONObject jsonObject = HttpClient.doGetstr(url);
        String openid = jsonObject.getString("openid");
        String access_token = jsonObject.getString("access_token");
        url = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
        url = url.replace("ACCESS_TOKEN", access_token).replace("OPENID", openid);
        return  HttpClient.doGetstr(url);
    }

    /**
     *
     * @param openid
     * @return
     */
    public JSONObject getUserInfo(String openid,String accessToken){
//        String accessToken = GetAccessToken.getAccessToken();
        String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
        url = url.replace("ACCESS_TOKEN",accessToken).replace("OPENID",openid);
        return HttpClient.doGetstr(url);
    }
}
