package org.aolin.com.common.msgType.resp;

import org.aolin.com.common.base.resp.BaseManage;
/**
 * 
 * @author aolin
 * @description ��Ӧ�ı���Ϣ����
 * @date 2014-5-28����09:26:59
 */
public class TextMessage extends BaseManage {
	/*
	 * �ظ�����Ϣ����
	 */
	private String Content = "151554";

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
