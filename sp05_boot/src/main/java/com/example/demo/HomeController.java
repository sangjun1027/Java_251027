package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		// rest가 붙으면 넘어가는 것은 data
public class HomeController {
	
		@GetMapping("/")
		public String hello() {		//String은 data값이당!
			return "Hi!!! Bye!!!";
		}

}
