package com.future.hist.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.future.hist.crm.domain.SalesOrder;

/**
 * 销售单service接口
 */
@Service
public interface SalesOrderService {
	
	// 销售单查询列表
	public List<SalesOrder> findOrdersList();
	
	//销售单的数量
	public long getOrdersCount();
}
