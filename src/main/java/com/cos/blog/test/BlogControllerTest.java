package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
//스프링이 객체를 생성하여 컨테이너에 관리한다
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return  "<h1> hello spring boot </h>";
	}
}
