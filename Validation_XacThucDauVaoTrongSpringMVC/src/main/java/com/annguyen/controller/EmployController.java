package com.annguyen.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.annguyen.model.Employee;

@Controller
public class EmployController {
	
	@RequestMapping("/loginForm")
	public String showForm(Model model) {
		model.addAttribute("emp", new Employee());
		return "viewpage";
	}
	
	//@ModelAttribute("emp") giong @RequestAttribute("reservation") la truyen object tu view -> view qua controller
	
	//@ModelAttribute("emp"): lay ra Bean hay Object (thuoc model) trong app, bien mat khi Controller ket thuc
	//@RequestParameter("reservation"): lay ra cac Parameter(tham so) doc lap ( client -> server)
	//@RequestAttribute("reservation"): lay ra cac Attribute(thuoc tinh) co the dang Object?? (server->client; server->server)
	@RequestMapping("/checkLogin")
	public String checkLogin(@Valid @ModelAttribute("emp") Employee employee, BindingResult br) {
		 if(br.hasErrors())  
	        {  
	            return "viewpage";  
	        }  
	        else  
	        {  
	        	return "final";  
	        }  
	}
}
