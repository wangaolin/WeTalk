package org.aolin.com.common.msgType.resp;

import java.util.List;

import org.aolin.com.common.base.resp.BaseManage;
/**
 * 
 * @author aolin
 * @description 响应图文消息
 * @date 2014-5-28上午09:29:35
 */
public class NewsMessage extends BaseManage {
	/*
	 * 图文消息个数，目前限制为10条
	 */
	private int ArticleCount;
	/*
	 * 多条图文消息，默认第一个item 为大图
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
