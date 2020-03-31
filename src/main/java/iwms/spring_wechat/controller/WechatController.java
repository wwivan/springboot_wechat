package iwms.spring_wechat.controller;

import iwms.spring_wechat.util.CheckUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class WechatController {
    @GetMapping("wechat")
    public String connect(@RequestParam("signature")String signature,
                          @RequestParam("timestamp")String timestamp,
                          @RequestParam("nonce")String nonce,
                          @RequestParam("echostr")String echostr){
        /**
         * signature	微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
         * timestamp	时间戳
         * nonce	随机数
         * echostr	随机字符串
         */
        System.out.println(signature);
        boolean b = CheckUtil.checkSignature(signature, timestamp, nonce);
        System.out.println(b);
        return echostr;
    }

}
