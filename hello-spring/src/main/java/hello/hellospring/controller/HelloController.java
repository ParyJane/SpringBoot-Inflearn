package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "value : Spring Boot!");
		return "hello";
	}
	
	@GetMapping("world")
	public String world(Model model) {
		model.addAttribute("data", "value : 스프링 부트!");
		return "world";
	}
	
	@GetMapping("hello-mvc")
	public String helloMvc(@RequestParam("name") String name, Model model) {
		// @RequestParam() : get 방식으로 값을 받음 
		// http://localhost:8080/hello-mvc?name=Spring!
		model.addAttribute("name", name);	
		return "hello-template";
	}
	
	@GetMapping("hello-string")
	@ResponseBody
	public String helloString(@RequestParam("name") String name) {
		// @ResponseBody 
		// : http의 header와 body중 body에 반환하는 데이터를 직접 넣어주겠다는 의미  
		//   뷰 리졸버( viewResolver )를 사용하지 않음
		return "hello " + name;
	}
	
	@GetMapping("hello-api")
	@ResponseBody
	public Hello helloApi(@RequestParam("name") String name) {
		// viewResolver 대신 HttpMessageConverter 동작
		// : 객체로 반환하면 JSON 형식으로 보여줌 
		Hello hello = new Hello();
		hello.setName(name);
		return hello;
	}
	
	static class Hello {
		
		private String name;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
	}
	
}
