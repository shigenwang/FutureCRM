package com.future.hist.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.future.hist.crm.domain.SalesOrder;

/**
 * 销售订单
 * @author 时帅帅
 *
 */
public interface SalesOrderMapper {

	public List<SalesOrder> selectProductsByPage(@Param(value = "startPos") Integer startPos,
			@Param(value = "pageSize") Integer pageSize);

	/**
	 * 获取所有的订单数量
	 * 
	 */
	public long getProductsCount();

}
