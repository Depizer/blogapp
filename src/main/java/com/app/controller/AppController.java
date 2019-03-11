package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("add")
	public ModelAndView add(@RequestParam("inp1")int num1,@RequestParam("inp2") int num2) {
		ModelAndView mv = new ModelAndView();
		int k = num1 + num2;
		mv.addObject("k", k);
		mv.setViewName("display.jsp");
		return mv;
	}
}
