package com.future.hist.crm.domain;

/**
 * @author 羊羊
 * @date 2016年4月2日
 * @description 省份类
 */
public class Province {

	private long id; // 为了和数据库中字段对应
	private String name; // 省份名称
	private String pycode;// 省份拼音缩写

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

	@Override
	public String toString() {
		return "Province [id=" + id + ", name=" + name + ", pycode=" + pycode + "]";
	}
	
}
