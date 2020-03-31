package iwms.spring_wechat.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Map;

@XStreamAlias("xml")
public class textMessage extends BaseMessage {

	@XStreamAlias("Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public textMessage(Map<String, String> requestMap, String content) {
		super(requestMap);
		// 设置文本消息的msgtype为text
		this.setMsgType("text");
		this.content = content;
		System.out.println(content);
	}

}
