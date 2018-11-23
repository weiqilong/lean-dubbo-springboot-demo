package com.wql.test.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wql.test.TestService;

/**
 * @Service(version="1.0.0") 这个注解是dubbo的注解
 * @author weiqilong
 * CREATE TIME 2018年11月23日 下午9:38:37
 */
@Service(version="1.0.0")
public class TestServiceImpl implements TestService{

	@Override
	public String getTheName(String name) {
		return "这个名字="+name;
	}

}
