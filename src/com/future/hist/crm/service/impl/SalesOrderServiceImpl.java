package com.future.hist.crm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.future.hist.crm.dao.SalesOrderMapper;
import com.future.hist.crm.domain.SalesOrder;
import com.future.hist.crm.service.SalesOrderService;
import com.future.hist.crm.utils.Page;

/**
 * 销售单
 */
public class SalesOrderServiceImpl implements SalesOrderService {

	// 注入mapper
	@Autowired
	private SalesOrderMapper salesOrderMapper;

	@Override
	public void showProductsByPage(HttpServletRequest request, Model model) {
		

		String pageNow = request.getParameter("pageNow");

		Page page = null;

		List<SalesOrder> orders = new ArrayList<SalesOrder>();

		int totalCount = (int) salesOrderMapper.getProductsCount();

		if (pageNow != null) {
			page = new Page(totalCount, Integer.parseInt(pageNow));
			orders = this.salesOrderMapper.selectProductsByPage(page.getStartPos(), page.getPageSize());
		} else {
			page = new Page(totalCount, 1);
			orders = this.salesOrderMapper.selectProductsByPage(page.getStartPos(), page.getPageSize());
		}

		model.addAttribute("orders", orders);
		model.addAttribute("page", page);
	}
}
