package iwms.spring_wechat.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import iwms.spring_wechat.entity.Button;
import iwms.spring_wechat.entity.ClickButton;
import iwms.spring_wechat.entity.Config;
import iwms.spring_wechat.entity.ViewButton;
import iwms.spring_wechat.util.Util;
import org.springframework.stereotype.Service;

@Service
public class CreatMenu {

    public String create_menu(String accessToken) {
        Button button = new Button();
//        button.getButton().add(new ClickButton("","1"));
        String menuUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=URL&response_type=code&scope=snsapi_userinfo&state=1#wechat_redirect";
        menuUrl = menuUrl.replace("APPID", Config.APP_ID).replace("URL",Config.BIND_URL);
        button.getButton().add(new ViewButton("绑定用户", menuUrl));
//        button.getButton().add(new ClickButton("用户信息",menuUrl));
        button.getButton().add(new ViewButton("首页", Config.VIEW_URL));
//        button.getButton().add(new ClickButton());
//        JSONObject jsonObject = JSONObject.parseObject(button.toString());
        JSON json = (JSON) JSONObject.toJSON(button);
        String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
        url = url.replace("ACCESS_TOKEN", accessToken);
        System.out.println(button.toString());
        String result = Util.post(url, json.toString());
        return json.toString();
    }
}
