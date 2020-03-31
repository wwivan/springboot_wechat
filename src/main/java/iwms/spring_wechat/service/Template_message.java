package iwms.spring_wechat.service;


import com.alibaba.fastjson.JSONObject;

import iwms.spring_wechat.entity.TemplateMessage;
import iwms.spring_wechat.util.GetAccessToken;
import iwms.spring_wechat.util.HttpRequest;
import org.springframework.stereotype.Service;

@Service
public class Template_message {
    public static final String temp_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    /**
     * 发送模板消息
     */

    public static void postTemplateMessage(TemplateMessage templateMessage) {
        String access_token = GetAccessToken.getAccessToken();
        String url = temp_message_url.replace("ACCESS_TOKEN", access_token);
        JSONObject jsonObject = JSONObject.parseObject(templateMessage.toString());
        HttpRequest.sendPost(url, jsonObject.toString());
    }
}

