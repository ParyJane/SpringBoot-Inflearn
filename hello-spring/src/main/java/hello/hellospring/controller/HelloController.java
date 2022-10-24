package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "value : Spring Boot!");
		return "hello";
	}
	
	@GetMapping("world")
	public String test(Model model) {
		model.addAttribute("data", "value : 스프링 부트!");
		return "world";
	}
	
}
