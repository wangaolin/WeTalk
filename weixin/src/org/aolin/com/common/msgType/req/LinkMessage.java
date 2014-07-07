package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * 接受的链接信息
 * @author aolin
 *
 */
public class LinkMessage extends BaseManage {
	/*
	 * 消息标题
	 */
	private String Title;
	/*
	 * 消息描述
	 */
	private String Description;
	/*
	 * 消息链接
	 */
	private String Url;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
}