package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.SlaveService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-mybatis.xml","classpath*:spring-service.xml"})
public class DemoTest {

	@Autowired
	private SlaveService slaveService;
	
	@Test
    public void testFindAllShop() {
        Integer count = slaveService.count();
        System.out.println("#######1:"+count);
        
        Integer count2 = slaveService.count2();
        System.out.println("#######2:"+count2);
    }
}
