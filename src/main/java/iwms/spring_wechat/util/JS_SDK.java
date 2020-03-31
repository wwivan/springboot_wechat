package iwms.spring_wechat.util;


import com.alibaba.fastjson.JSONObject;
import iwms.spring_wechat.entity.Config;
import iwms.spring_wechat.entity.Ticket;

public class JS_SDK {
    public static String appId = Config.APP_ID;
    public static String appSecret = Config.APP_SECRET;
    public static String token = GetAccessToken.getAccessToken();
    public static final String get_ticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=wx_card";
    private static Ticket tk;
    private static void getTk(){
        String url = get_ticket_url.replace("ACCESS_TOKEN", token);
        String ticketStr = Util.get(url);
        JSONObject jsonObject = JSONObject.parseObject(ticketStr);
        System.out.println(jsonObject);
        String ticket = jsonObject.getString("ticket");

        String expireIn = jsonObject.getString("expires_in");

        tk = new Ticket(ticket, expireIn);
    }

    public static String getTicket() {
        if(tk==null||tk.isExpired()) { //判断是否存在access_token以及token值是否过期
            getTk();
        }
        return tk.getTicket();
    }
}
