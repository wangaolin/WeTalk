package org.aolin.com.common.base.resp;
/**
 * ��Ӧ��Ϣ������
 * @author aolin
 *
 */
public class BaseManage {
	/*
	 * ������΢�ź�
	 */
	private String ToUserName;
	/*
	 * ���ͷ��˺ţ�һ��OpenID�� 
	 */
	private String FromUserName;
	/*
	 * ��Ϣ����ʱ�� �����ͣ� 
	 */
	private long CreateTime;
	/*
	 * ��Ϣ���ͣ�text��image��location��link
	 */
	private String MsgType;
	/*
	 * λ0x0001����־ʱ���Ǳ���յ�����Ϣ  
	 */
	private int FuncFlag;
	
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		this.ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.FromUserName = fromUserName;
	}
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		this.CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		this.MsgType = msgType;
	}
	public int getFuncFlag() {
		return FuncFlag;
	}
	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}
}
