package com.spring.spring.mvc;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	@RequestMapping("/processForm")
	public  String processForm(@Valid @ModelAttribute("customer") Customer cus,BindingResult thebindingresult)
	{
		if(thebindingresult.hasErrors())
			return "customer-form";
		else
		    return "customer_confirmation";
		
	}
			
	
}
