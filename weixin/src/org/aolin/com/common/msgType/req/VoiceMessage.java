package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * ���ܵ�������Ϣ
 * @author aolin
 *
 */
public class VoiceMessage extends BaseManage {
	/*
	 *  ý��id
	 */
	private String MediaId;
	/*
	 * ý���ʽ
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
