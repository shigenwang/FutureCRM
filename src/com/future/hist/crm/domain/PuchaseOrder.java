package com.future.hist.crm.domain;
/**
 * 进货单
 * @author Administrator
 *
 */
public class PuchaseOrder {

	private Long id;
	private Supplier supplier;            //供货商
	private User user;                    //业务员
	private Commodity commodity;          //商品
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	@Override
	public String toString() {
		return "PuchaseOrder [id=" + id + ", supplier=" + supplier + ", user=" + user + ", commodity=" + commodity
				+ "]";
	}
	
}
