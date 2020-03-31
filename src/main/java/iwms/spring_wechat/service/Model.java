package iwms.spring_wechat.service;

import com.alibaba.fastjson.JSONObject;

import iwms.spring_wechat.entity.Content;
import org.springframework.stereotype.Service;


@Service
public class Model {
    /**
     * 通用模型
     * @param content
     * @return
     */
    public JSONObject common(Content content){
        JSONObject data = new JSONObject();
        data.put("touser", content.getOpenId());
        data.put("template_id", content.getTempMessageId());
        data.put("url",content.getUrl());
        JSONObject message = new JSONObject();
        JSONObject first = new JSONObject();
        JSONObject keyword1 = new JSONObject();
        JSONObject keyword2 = new JSONObject();
        JSONObject keyword3 = new JSONObject();
        JSONObject keyword4 = new JSONObject();
        JSONObject keyword5 = new JSONObject();
        JSONObject remark = new JSONObject();
        first.put("value", content.getFirst());
        first.put("color", content.getColor1());
        keyword1.put("value", content.getKeyword1());
        keyword1.put("color", content.getColor1());
        keyword2.put("value", content.getKeyword2());
        keyword2.put("color", content.getColor1());
        keyword3.put("value", content.getKeyword3());
        keyword3.put("color", content.getColor1());
        keyword4.put("value", content.getKeyword4());
        keyword4.put("color", content.getColor1());
        keyword5.put("value", content.getKeyword5());
        keyword5.put("color", content.getColor1());
        remark.put("value", content.getRemark());
        remark.put("color", content.getColor2());

        message.put("first", first);
        message.put("keyword1", keyword1);
        message.put("keyword2", keyword2);
        message.put("keyword3", keyword3);
        message.put("keyword4", keyword4);
        message.put("keyword5", keyword5);
        message.put("remark", remark);
        data.put("data", message);
        return data;
    }
}
