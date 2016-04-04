package com.future.hist.crm.domain;

/**
 * @author 羊羊
 * @date 2016年4月2日
 * @description 城市类
 */
public class City {

	private long id;// 为了和数据库中字段对应
	private String name;// 城市名称
	private String pycode;// 城市首字母缩写
	private long pid;// 所属省份id
	private String postcode;// 邮政编码
	private String areacode;// 区域编码

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPycode() {
		return pycode;
	}

	public void setPycode(String pycode) {
		this.pycode = pycode;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", pycode=" + pycode + ", pid=" + pid + ", postcode=" + postcode
				+ ", areacode=" + areacode + "]";
	}
}
