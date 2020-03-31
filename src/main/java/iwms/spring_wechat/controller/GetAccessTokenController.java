package iwms.spring_wechat.controller;


import iwms.spring_wechat.util.GetAccessToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GetAccessTokenController {
    @GetMapping("accessToken")
    public String getAccessToken(){
        return GetAccessToken.getAccessToken();
    }
}
