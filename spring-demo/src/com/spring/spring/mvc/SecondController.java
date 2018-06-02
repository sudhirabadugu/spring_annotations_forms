package com.spring.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SecondController {
	
	@RequestMapping("/processnext")
	 public String processnext(@RequestParam("uid")String nme ,Model model)
	{
	
	model.addAttribute(nme);	
	 return "name";	
	}

                         
}