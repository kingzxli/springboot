package com.tedu.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springcloud 依赖于springboot实现微服务，springboot默认集成springmvc组建springcloud
  * 使用springmvc编写微服务http接口，微服务通讯接口(http+json格式)
 * @author kingz
 */
@RestController  //表示该类中的方法返回json格式(等于@controller+@ResponseBody)
public class MemberController {
	
	@RequestMapping("memberIndex")  //springMVC注解方式启动内置http服务器(默认tomcat)
	public String memberIndex() {
		return "helloword";
	}
	
	public static void main(String[] args) {
		//程序入口(http://localhost:8080/memberIndex)
		SpringApplication.run(MemberController.class, args);
	}
}
