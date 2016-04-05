package com.future.hist.crm.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface SalesOrderService {
	/**
	 * 分页显示订单
	 * 
	 * @param request
	 * @param model
	 */
	void showProductsByPage(HttpServletRequest request, Model model);

}
