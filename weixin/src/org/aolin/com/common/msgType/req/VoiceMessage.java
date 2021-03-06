package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * 接受的语音消息
 * @author aolin
 *
 */
public class VoiceMessage extends BaseManage {
	/*
	 *  媒体id
	 */
	private String MediaId;
	/*
	 * 媒体格式
	 */
	private String Format;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
}
