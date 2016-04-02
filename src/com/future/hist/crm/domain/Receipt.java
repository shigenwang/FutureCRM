package com.future.hist.crm.domain;
import java.util.Date;
/**
 * 收款单
 * @author Administrator
 *
 */
public class Receipt {

	private Long id;
	private Customer customer;
	private Date createTime;
	private double amountReceivable;    //应收金额
	private String salesmen;            //业务人
	private User personal;              //所属人
	private double totalMoney;          //总金额
	private User handler;               //经手人（审核人）
	private boolean states;             //状态（审核状态）
	private Date collectionDays;        //收款时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public double getAmountReceivable() {
		return amountReceivable;
	}
	public void setAmountReceivable(double amountReceivable) {
		this.amountReceivable = amountReceivable;
	}
	public String getSalesmen() {
		return salesmen;
	}
	public void setSalesmen(String salesmen) {
		this.salesmen = salesmen;
	}
	public User getPersonal() {
		return personal;
	}
	public void setPersonal(User personal) {
		this.personal = personal;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public User getHandler() {
		return handler;
	}
	public void setHandler(User handler) {
		this.handler = handler;
	}
	public boolean isStates() {
		return states;
	}
	public void setStates(boolean states) {
		this.states = states;
	}
	public Date getCollectionDays() {
		return collectionDays;
	}
	public void setCollectionDays(Date collectionDays) {
		this.collectionDays = collectionDays;
	}
	@Override
	public String toString() {
		return "Receipt [id=" + id + ", customer=" + customer + ", createTime=" + createTime + ", amountReceivable="
				+ amountReceivable + ", salesmen=" + salesmen + ", personal=" + personal + ", totalMoney=" + totalMoney
				+ ", handler=" + handler + ", states=" + states + ", collectionDays=" + collectionDays + "]";
	}
	
}
