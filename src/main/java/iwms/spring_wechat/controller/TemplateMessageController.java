package iwms.spring_wechat.controller;

import iwms.spring_wechat.entity.Content;
import iwms.spring_wechat.entity.TempMessageIDS;
import iwms.spring_wechat.service.PostTempMessage;
import iwms.spring_wechat.util.GetAccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TemplateMessageController {
    @Autowired
    PostTempMessage postTempMessage;
    @PostMapping("templateMessage")
    public void sentMessage(){
        /**
         * 发送入库模板消息
         */
        Content content = new Content();
        String accessToken = GetAccessToken.getAccessToken();//后端可以通过接口获取accessToken
        content.setOpenId("");
        content.setTempMessageId(TempMessageIDS.stockInId);
        content.setFirst("");
        content.setKeyword1("");
        content.setKeyword2("");
        content.setKeyword3("");
        content.setKeyword4("");
        content.setKeyword5("");
        content.setRemark("");
        postTempMessage.postMessage(accessToken,content);
    }

}
