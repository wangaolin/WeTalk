package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * 文本消息
 * @author aolin
 *
 */
public class TextManage extends BaseManage{
	/*
	 * 用户回复的信息
	 */
	private String Context;

	public String getContext() {
		return Context;
	}

	public void setContext(String Context) {
		this.Context = Context;
	}
}
