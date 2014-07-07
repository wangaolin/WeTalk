package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * 接受的图片消息
 * @author aolin
 *
 */
public class ImageMessage extends BaseManage {
	
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		this.PicUrl = picUrl;
	}
}
