package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OMnieController {
	
	@RequestMapping("/")
	public String home(){
		return "oMnie";
	}
	@RequestMapping("/oMnie")
	public String oMnie(){
		return "oMnie";
	}
}
