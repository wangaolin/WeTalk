package org.aolin.com.common.msgType.resp;

import org.aolin.com.common.base.resp.BaseManage;
/**
 * 
 * @author aolin
 * @description 响应文本消息内容
 * @date 2014-5-28上午09:26:59
 */
public class TextMessage extends BaseManage {
	/*
	 * 回复的消息内容
	 */
	private String Content = "151554";

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
