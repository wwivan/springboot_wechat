package iwms.spring_wechat.service;

import com.alibaba.fastjson.JSONObject;

import iwms.spring_wechat.entity.Content;
import iwms.spring_wechat.util.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostTempMessage {
    @Autowired
    Model model;
    public static final String temp_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

    public void postMessage(String access_token, Content content){
        String url = temp_message_url.replace("ACCESS_TOKEN", access_token);
        JSONObject order1 = model.common(content);
        HttpRequest.sendPost(url, order1.toString());
    }
}
