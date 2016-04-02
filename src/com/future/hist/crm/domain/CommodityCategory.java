package com.future.hist.crm.domain;

import java.util.HashSet;
import java.util.Set;
/**
 * 商品类别
 * @author Administrator
 *
 */
public class CommodityCategory {

	private Long id;
	private String name;
	private String description;
	private Set<Commodity> commodities = new HashSet<Commodity>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Commodity> getCommodities() {
		return commodities;
	}
	public void setCommodities(Set<Commodity> commodities) {
		this.commodities = commodities;
	}
	@Override
	public String toString() {
		return "CommodityCategory [id=" + id + ", name=" + name + ", description=" + description + ", commodities="
				+ commodities + "]";
	}
	
}
