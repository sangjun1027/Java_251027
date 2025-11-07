package com.yedam.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
	
	// 회원가입page
	@GetMapping("/member")
	public void memberForm(Member member) {
		
	}
	
	// 회원가입처리 page
	@PostMapping("/member")
	public String memberRegister(@Valid Member member,	//유효성체크 
								 BindingResult result) {
		if(result.hasErrors()) {
			return "/member";
		} else {
		log.info(member.toString());	//회원가입처리
		return "redirect:/";
		}
	}
}
