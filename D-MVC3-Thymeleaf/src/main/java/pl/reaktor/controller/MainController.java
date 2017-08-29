package pl.reaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.model.Register;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("reg", new Register());
		return "home";
	}
	@PostMapping("/result")
	public String result(@ModelAttribute Register reg, Model model){ // dodajemy do naszego widoku atrybut pochodzacy z widoku w ktorym zrobilismy formularz
		model.addAttribute("reg", reg);
		if(reg.getLogin().length()>= 5){
			return "result";
		}else{
			return"redirect:/";
		}
	
	}

}
