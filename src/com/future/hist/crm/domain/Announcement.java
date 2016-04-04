package com.future.hist.crm.domain;

import java.util.Date;

/**
 * 公告
 * @author Administrator
 *
 */
public class Announcement {

	private Long id;
	private String title;                 //标题
	private String content;               //内容
	private User issuer;                  //发布人
	private Date issue_date;              //发布日期
	private Department department;        //部门
	public User getIssuer() {
		return issuer;
	}
	public void setIssuer(User issuer) {
		this.issuer = issuer;
	}
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
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Announcement [id=" + id + ", title=" + title + ", content=" + content + ", issuer=" + issuer
				+ ", issue_date=" + issue_date + ", department=" + department + "]";
	}
	
}
