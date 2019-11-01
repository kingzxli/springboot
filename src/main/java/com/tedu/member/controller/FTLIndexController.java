package com.tedu.member.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //跳转页面
public class FTLIndexController {
	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String,Object> map) {
		map.put("name", "马云");
		map.put("age", 50);
		map.put("money", "200亿");
		map.put("sex", "0");
		return "ftlIndex";
	}
}
