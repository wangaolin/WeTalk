package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * ���ܵ�������Ϣ
 * @author aolin
 *
 */
public class LinkMessage extends BaseManage {
	/*
	 * ��Ϣ����
	 */
	private String Title;
	/*
	 * ��Ϣ����
	 */
	private String Description;
	/*
	 * ��Ϣ����
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