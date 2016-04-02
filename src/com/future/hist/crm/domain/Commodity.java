package com.future.hist.crm.domain;
/**
 * 商品
 * @author Administrator
 *
 */
public class Commodity {

	private Long id;
	private String commodityNumber;                    //商品编号
	private String name;                               //商品名称
	private CommodityCategory commodityCategory;       //商品类型
	private double bid;                                //进价
	private double price;                              //售价
	private String description;                        //描述
	private Long commodityQuantity;                    //商品数量
	private Long purchaseQuantity;                     //进货量
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCommodityNumber() {
		return commodityNumber;
	}
	public void setCommodityNumber(String commodityNumber) {
		this.commodityNumber = commodityNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CommodityCategory getCommodityCategory() {
		return commodityCategory;
	}
	public void setCommodityCategory(CommodityCategory commodityCategory) {
		this.commodityCategory = commodityCategory;
	}
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCommodityQuantity() {
		return commodityQuantity;
	}
	public void setCommodityQuantity(Long commodityQuantity) {
		this.commodityQuantity = commodityQuantity;
	}
	public Long getPurchaseQuantity() {
		return purchaseQuantity;
	}
	public void setPurchaseQuantity(Long purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", commodityNumber=" + commodityNumber + ", name=" + name
				+ ", commodityCategory=" + commodityCategory + ", bid=" + bid + ", price=" + price + ", description="
				+ description + ", commodityQuantity=" + commodityQuantity + ", purchaseQuantity=" + purchaseQuantity
				+ "]";
	}
}
