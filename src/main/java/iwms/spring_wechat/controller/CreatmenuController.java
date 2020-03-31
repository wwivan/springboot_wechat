package iwms.spring_wechat.controller;

import iwms.spring_wechat.base.base.Response;
import iwms.spring_wechat.service.CreatMenu;
import iwms.spring_wechat.util.GetAccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CreatmenuController {
    @Autowired
    CreatMenu creatMenu;
    @RequestMapping("menu")
    public Response creatMenu(){
        String accessToken = GetAccessToken.getAccessToken();
        String menu = creatMenu.create_menu(accessToken);
        return Response.success(menu);
    }
}
