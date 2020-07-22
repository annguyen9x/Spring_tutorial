package com.annguyen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.annguyen.dao.EmployDao;
import com.annguyen.model.Employ;
@Controller
public class EmployController {
	
	@Autowired
	EmployDao employDao;//will inject dao from XML file  
	
	/*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */
	@RequestMapping("/addEmp")
	public String addForm(Model model) {
		System.out.println("addForm");
		model.addAttribute("command", new Employ());
		return "empAddForm";
	}
	
	 /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/    
	@RequestMapping( value = "/save", method = RequestMethod.POST)
	public String saveAdd(@ModelAttribute("employ") Employ employ) {
		System.out.println("saveAdd");
		employDao.save(employ);
		return "redirect:viewEmp";//will redirect to viewemp request mapping 
	}
	
	//will redirect to viewemp request mapping 
	@RequestMapping("/viewEmp")
	public String viewEmploy(Model model) {
		System.out.println("viewEmploy");
		List<Employ> list = employDao.getAllEmploy();
		model.addAttribute("list", list);
		return "viewEmp";
	}
	
	/* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/ 
	@RequestMapping(value = "/editEm/{id}")//Truyá»�n id vÃ o URL ???
	public String edit(@PathVariable int id, Model model) {//Láº¥y thuá»™c tÃ­nh id Ä‘Ã£ truyá»�n vÃ o Ä‘Æ°á»�ng dáº«n
		System.out.println("edit");
		Employ employEdit = employDao.getEmployById(id);
		model.addAttribute("employ", employEdit);
		
		return "empEditForm";
	}
	
	 /* It updates model object. */    
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String saveEdit(@ModelAttribute("employ") Employ employ) {
		System.out.println("saveEdit");
		employDao.update(employ);
		return "redirect:viewEmp";
	}
	
	/* It deletes record for the given id in URL and redirects to /viewemp */    
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String deleteEmp(@PathVariable int id) {
		System.out.println("deleteEmp");
		employDao.delete(id);
		return "redirect:/viewEmp";
	}
	
}
