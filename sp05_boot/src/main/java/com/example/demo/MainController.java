package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller		//rest가 없다잉
public class MainController {
	@GetMapping("/main")
	public String hello(Model model) {	//model은 택배차다잉!
		model.addAttribute("serverTime", new Date());
		return "main";	// template 폴더 안에있는 main.html
	}
}
