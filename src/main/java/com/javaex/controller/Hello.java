package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

	//pojo개념으로 상속 안 받고 서블렛도 아니고 그냥 자바파일로 생성.
	//아래는 라이브러리 받은 거에서 쓰는 스프링 문법이라 라이브러리 없으면 안 돌아감.

@Controller
public class Hello {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("/hellospring/hello");
		return "/WEB-INF/views/index.jsp";
	}
}
