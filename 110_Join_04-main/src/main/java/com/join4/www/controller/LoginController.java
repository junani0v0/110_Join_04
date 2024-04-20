package com.join4.www.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.join4.www.service.JoinService;

@Controller
public class LoginController {
	public LoginController() {
		System.out.println("-----------------생성-----------------");
	}
	
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		return "login";
	}
	
	
	@Autowired
	private JoinService joinService;
	
	@RequestMapping("/join.do")
	public ModelAndView join(@RequestParam HashMap<String, String> params) {
//		System.out.println("-------------"+params);
		int result = joinService.join(params);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", result);
		String msg = (result == 0) ? "실패" : "성공";
		mv.addObject("msg",msg);
		mv.setViewName("login");
		return mv;
		
	}
	
}
