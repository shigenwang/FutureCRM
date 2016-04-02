package com.future.hist.crm.domain;

import java.util.Date;

public class SalesOrder {

	private Long id;
	private String saleNumber;
	private Date createTime;
	private User salesman;
	private Contacts contacts;
	private String contactPhone;
	private String deliveryAddress;
}
