package com.yedam.sample.web;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/sample/*")
public class SampleController {
	@GetMapping("/success")
	public String success() {
		return "success";
	}
	
	// 빈 문자열이므로 추가 경로 없음 = 클래스 매핑 그대로
	@RequestMapping(value={"insert", "/"}, method = {RequestMethod.POST, RequestMethod.GET})		// return값이 아무것도 없으면 localhost/sample
	public void basic() {
		// log4j2(lombok) 어노테이션 
		log.info("basic....");		// syso 대신
	}
	
	@GetMapping("/ex01")	//ex01?name=aaa&age=20 	// 페이징
	public String ex01(@ModelAttribute("sample") SampleDTO sample,
												 RedirectAttributes ra) {
		log.info("sampleDTO" + sample);
		ra.addFlashAttribute("msg", "가입축하!!!");	// addFlash는 휘발성, 1번만!
		ra.addAttribute("name", sample.getName());
		ra.addAttribute("date", new Date());
		//return "redirect:success";	// http://localhost:81/success
										// redirect 뒤에는 매핑 url을 적어줌
										// forword 뒤에는 페이지 명
		return "redirect:/sample/success";	// 절대경로로 설정해줘야 됨
	}
	
	
	@GetMapping("/ex02")		// ex02?name=aaa&age=20		//페이징
	public String ex02(@RequestParam ("name") String name,
					   @RequestParam(value = "birth") Date birth,
					   @RequestParam(value = "age", 
					   				 required = false,
					   				 defaultValue = "10") int age) {
		log.info(name + ":" + age);
		return "ex02";
	}

	@GetMapping("/ex02Array")					// ex02?ids=3&ids=4&ids=10 	//체크박스
	public void ex02Array(@RequestParam("ids") List<String> ids ) {
		log.info("ids:" + ids);
	}
	
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mv = new ModelAndView("/hello", "greet", "hi");
		// mv.setViewName("/hello");
		// mv.addObject("greet","hi");
		return mv;
	}
}
