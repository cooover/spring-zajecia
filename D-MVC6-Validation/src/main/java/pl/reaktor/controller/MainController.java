package pl.reaktor.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.reaktor.model.Person;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("person", new Person());
		return "home";
	}
	@PostMapping("/")
	public String validForm(@Valid @ModelAttribute Person person, BindingResult result){
		if(result.hasErrors()){
			List<ObjectError> errors = result.getAllErrors();
			errors.forEach(err -> System.out.println(err.getDefaultMessage()));
		}
		return "home";
	}
}
