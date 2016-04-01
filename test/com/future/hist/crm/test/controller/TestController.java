package com.future.hist.crm.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("hello")
	public String hello(){
		System.out.println("hello ~~");
		return "sucess";
	}
}
