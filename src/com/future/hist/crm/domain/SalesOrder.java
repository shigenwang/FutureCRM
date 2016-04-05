 package com.future.hist.crm.domain;

import java.util.Date;
/**
 * 销售单
 * @author Administrator
 *
 */
public class SalesOrder {

	private Long id;
	private String saleNumber;            //销售单号
	private Date createTime;              //开单日期
	private User salesman;                //业务员
	private Customer customer;            //客户
	private Contacts contacts;            //联系人
	private String contactPhone;          //联系人电话
	private String deliveryAddress;       //送货地址
	private String remark;                //备注
	private String goods;                 //购买商品清单
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSaleNumber() {
		return saleNumber;
	}
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public User getSalesman() {
		return salesman;
	}
	public void setSalesman(User salesman) {
		this.salesman = salesman;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Contacts getContacts() {
		return contacts;
	}
	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "SalesOrder [id=" + id + ", saleNumber=" + saleNumber + ", createTime=" + createTime + ", salesman="
				+ salesman + ", customer=" + customer + ", contacts=" + contacts + ", contactPhone=" + contactPhone
				+ ", deliveryAddress=" + deliveryAddress + ", remark=" + remark + ", goods=" + goods + "]";
	}
	
}
