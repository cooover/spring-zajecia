package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
	// @GetMapping("adres")
	@RequestMapping("/info")
	public String info(){
		return "info";
	}
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}