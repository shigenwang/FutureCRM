package com.future.hist.crm.domain;
import java.util.HashSet;
import java.util.Set;
/**
 * 供应商
 * @author Administrator
 *
 */
public class Supplier {

	private Long id;
	private String name;
	private String phone;
	private Set<PuchaseOrder> puchaseOrders = new HashSet<PuchaseOrder>();
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<PuchaseOrder> getPuchaseOrders() {
		return puchaseOrders;
	}
	public void setPuchaseOrders(Set<PuchaseOrder> puchaseOrders) {
		this.puchaseOrders = puchaseOrders;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", phone=" + phone + ", puchaseOrders=" + puchaseOrders + "]";
	}  
	

}
