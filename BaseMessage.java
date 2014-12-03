package org.panzheng.course.message.req;

/**
 * 
 * 消息基类（普通用户->公共账号）
 * 
 * @author PanZheng
 * 
 */
public class BaseMessage {
	//开发者微信
	private String ToUserName;
	//发送方账号(一个OpenID)
	private String fromUserName;
	//消息创建时间(整型)
	private long CreateTime;
	//消息类型 (text/image/location/link)
	private String MsgType;
	//消息id,64位整型
	private long MsgId;
	
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	

}
