package com.tedu.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration //自动配置，扫包范围默认是当前类
@ComponentScan("com.tedu.member.controller")
public class App {
	public static void main(String[] args) {
		//程序入口(http://localhost:8080/memberIndex)
		SpringApplication.run(App.class, args);
	}
}
