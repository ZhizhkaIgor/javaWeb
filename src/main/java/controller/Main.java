package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {

	@GetMapping
	public ModelAndView main() {
		System.out.println("here");
		ModelAndView model = new ModelAndView("main");
		return model;
	}
}
