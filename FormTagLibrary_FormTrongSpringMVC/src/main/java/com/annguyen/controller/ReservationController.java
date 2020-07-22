package com.annguyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.annguyen.model.Reservation;


@RequestMapping("/reservation")
@Controller
public class ReservationController {
	
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		//Create a Reservation (Ä�áº·t phÃ²ng) Object
		Reservation reservation = new Reservation();
		//provide reservation object to model
		model.addAttribute("reservation", reservation);
		
		return "reservation-page";
	}
	
	@RequestMapping("/submitForm")
	//@RequestAttribute binds(liÃªn káº¿t) form data to the object, 
	//tá»©c lÃ  truyá»�n vÃ o view má»™t thuá»™c tÃ­nh(Attribute) Object tá»« view nÃ y sang view khÃ¡c thÃ´ng qua Controller
	//, thay vÃ¬ pháº£i táº¡o má»™t Model -> rá»“i pháº£i addAttribute Object vÃ o á»Ÿ Controller Ä‘á»ƒ truyá»�n vÃ o view
	public String submitForm(@RequestAttribute("reservation") Reservation reservation)
	{
		return "confirmation-form";
	}
}
