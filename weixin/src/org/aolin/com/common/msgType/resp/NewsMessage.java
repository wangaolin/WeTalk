package org.aolin.com.common.msgType.resp;

import java.util.List;

import org.aolin.com.common.base.resp.BaseManage;
/**
 * 
 * @author aolin
 * @description ��Ӧͼ����Ϣ
 * @date 2014-5-28����09:29:35
 */
public class NewsMessage extends BaseManage {
	/*
	 * ͼ����Ϣ������Ŀǰ����Ϊ10��
	 */
	private int ArticleCount;
	/*
	 * ����ͼ����Ϣ��Ĭ�ϵ�һ��item Ϊ��ͼ
	 */
	private List<Article> Articles;
	
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
	public List<Article> getArticles() {
		return Articles;
	}
	public void setArticles(List<Article> articles) {
		Articles = articles;
	}
}
