package iwms.spring_wechat.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Map;

@XStreamAlias("xml")
public class VoiceMessage extends BaseMessage{
	@XStreamAlias("MediaId")
	private String mediaId;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public VoiceMessage(Map<String, String> requestMap, String mediaId) {
		super(requestMap);
		this.setMsgType("voice");
		this.mediaId = mediaId;
	}
	
	
}
