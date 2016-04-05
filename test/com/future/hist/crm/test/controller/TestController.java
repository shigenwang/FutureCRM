package com.future.hist.crm.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hello ~~");
		return "sucess";
	}
	
//	@RequestMapping("insert")
//	public String testInsert(){
//		Long id = (long) 1;
//		String name = "sssss";
//		Test test = new Test(id, name);
//		testDao.save(test);
//		System.out.println("test save Sucess");
//		return "sucess";
//	}
}
