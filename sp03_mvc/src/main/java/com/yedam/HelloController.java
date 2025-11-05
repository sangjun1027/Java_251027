package com.yedam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller		// @Component subclass 1번기능: 컨테이너에 bean으로 등록  2번기능:컨트롤러화(상속대신) POJO
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		System.out.println("컨트롤러 동작함");
		return "hello";
	}
}
