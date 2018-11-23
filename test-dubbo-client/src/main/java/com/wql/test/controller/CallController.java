package com.wql.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wql.test.TestService;

/**
 * 消费方
 * @author weiqilong
 * CREATE TIME 2018年11月23日 下午9:46:51
 */
@RestController
@RequestMapping("/call")
public class CallController {
	
	/**
	 * @Reference(version="1.0.0")
	 * 使用dubbo的注解
	 */
	@Reference(version="1.0.0")
	public TestService testService;
	
	@RequestMapping("/name")
	public String callName(){
		
		String theName = testService.getTheName(this.getClass().getName());
		
		return theName;
	}
}
