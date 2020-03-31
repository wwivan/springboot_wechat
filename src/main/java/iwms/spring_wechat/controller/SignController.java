package iwms.spring_wechat.controller;

import iwms.spring_wechat.base.base.Response;
import iwms.spring_wechat.entity.Signature;
import iwms.spring_wechat.service.GetSignature;
import iwms.spring_wechat.util.SignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("wx")
public class SignController {
    @Autowired
    GetSignature getSignature;

    @PostMapping("config")
    public Response getConfig(@RequestBody String url) {
        String noncestr = UUID.randomUUID().toString();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        Signature signature = new Signature();
        signature.setTimestamp(timestamp);
        signature.setUrl(url);
        signature.setNoncestr(noncestr);
        Signature config = getSignature.config(signature);
        return Response.success(config);
    }
}
