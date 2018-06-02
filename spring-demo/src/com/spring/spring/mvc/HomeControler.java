package com.spring.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {
@RequestMapping("/")
public String hello()
{
	return "hello";
}

@RequestMapping(value="/showform", method = RequestMethod.GET)
public String showform(Model model)
{
	Student st= new Student();
	model.addAttribute("student",st);
	/*model.addAttribute("Country",st.getCountry());
	model.addAttribute("firstname",st.getFirstName());
	model.addAttribute("lastname",st.getLastName());*/
	//model.addAttribute(, arg1)
	return "main_menu";
}
@RequestMapping(value="/processform",method=RequestMethod.POST)
public String processform(@ModelAttribute("student")Student st)
{
	System.out.println("the first name"+st.getFirstName());
	return "name";
}

}
