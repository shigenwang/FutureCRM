package com.future.hist.crm.domain;
/**
 * 新闻
 * @author Administrator
 */
import java.util.Date;

public class News {

	private Long id;              
	private String title;       // 标题
	private String content;     //内容
	private User issuer;        //发布人
	private Date issur_date;    //发布日期
	private String newsType;    //新闻类型
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getIssuer() {
		return issuer;
	}
	public void setIssuer(User issuer) {
		this.issuer = issuer;
	}
	public Date getIssur_date() {
		return issur_date;
	}
	public void setIssur_date(Date issur_date) {
		this.issur_date = issur_date;
	}
	public String getNewsType() {
		return newsType;
	}
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content + ", issuer=" + issuer + ", issur_date="
				+ issur_date + ", newsType=" + newsType + "]";
	}
	
}
