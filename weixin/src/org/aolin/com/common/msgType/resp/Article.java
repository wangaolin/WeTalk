package org.aolin.com.common.msgType.resp;

/**
 * 
 * @author aolin
 * @description ͼ����Ϣ�Ķ���
 * @date 2014-5-28����09:36:04
 */
public class Article {
	/*
	 * ͼ����Ϣ����
	 */
	private String Title;
	/*
	 * ͼ����Ϣ����
	 */
	private String Description;
	/*
	 * ͼƬ���ӣ�֧��JPG��PNG��ʽ��<br>
	 * �Ϻõ�Ч��Ϊ��ͼ640*320��Сͼ80*80
	 */
	private String PicUrl;
	/*
	 * ���ͼ����Ϣ��ת����
	 */
	private String Url;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}

}
