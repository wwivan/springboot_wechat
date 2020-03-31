package iwms.spring_wechat.service;

import iwms.spring_wechat.entity.Signature;
import iwms.spring_wechat.util.SignUtil;
import org.springframework.stereotype.Service;

@Service
public class GetSignature {
    public Signature config(Signature signature){
        signature.setSignature(SignUtil.getSignature(signature));
        return signature;
    }
}
