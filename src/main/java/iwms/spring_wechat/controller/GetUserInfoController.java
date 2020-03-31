package iwms.spring_wechat.controller;

import com.alibaba.fastjson.JSONObject;

import iwms.spring_wechat.base.base.Response;
import iwms.spring_wechat.base.base.SystemReq;
import iwms.spring_wechat.util.GetAccessToken;
import iwms.spring_wechat.util.GetUserInfo;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class GetUserInfoController {
    /**
     * 网页授权方式获取用户信息
     * @param code
     * @return
     */
    @GetMapping("getUserInfo")
    public Response getUserInfo(@RequestParam(value = "code")String code){
        GetUserInfo getUserInfo = new GetUserInfo();
        JSONObject userInfo = getUserInfo.getUserInfoByCode(code);
        return Response.success(userInfo);
    }

    /**
     * openid方式获取用户信息
     * @param req
     * @return
     */
    @PostMapping("getUserInfo")
    public Response getUserInfoById(@RequestBody SystemReq req){
        GetUserInfo getUserInfo = new GetUserInfo();
        String openId = req.getOpenId();
        String accessToken = GetAccessToken.getAccessToken();
        JSONObject userInfo = getUserInfo.getUserInfo(openId,accessToken);
        return Response.success(userInfo);
    }

}
