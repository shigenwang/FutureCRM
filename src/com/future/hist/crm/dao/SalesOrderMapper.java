package com.future.hist.crm.dao;

import java.util.List;

import com.future.hist.crm.domain.SalesOrder;

/**
 * 销售订单
 */
public interface SalesOrderMapper {


	/**
	 * 查询所有销售单
	 */
	List<SalesOrder> findOrdersList();	
	
	/**
	 * 获取所有的订单数量
	 * 
	 */
	public long getOrdersCount();

}
