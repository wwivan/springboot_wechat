package iwms.spring_wechat.util;



import com.alibaba.fastjson.JSONObject;
import iwms.spring_wechat.entity.Signature;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.UUID;

public class SignUtil {
//    public static String ticket = JS_SDK.getTicket();
//    public static String noncestr = UUID.randomUUID().toString();
//    public static String timestamp = Long.toString(System.currentTimeMillis() / 1000);
//    public static String url = "http://mp.weixin.qq.com?params=value";

    public static String getSignature(Signature req){
        String ticket = JS_SDK.getTicket();
        String noncestr = req.getNoncestr();
        String timestamp = req.getTimestamp();
        String url = req.getUrl();
        String str = "jsapi_ticket=" + ticket +
                "&noncestr=" + noncestr +
                "&timestamp=" + timestamp +
                "&url=" + url;
        //sha1加密
        String signature = SHA1(str);
        return signature;
    }



    public static String SHA1(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1"); //如果是SHA加密只需要将"SHA-1"改成"SHA"即可
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexStr = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexStr.append(0);
                }
                hexStr.append(shaHex);
            }
            return hexStr.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}
