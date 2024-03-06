package com.example.springboot.myFirstWebApp.SayHelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
	//"say-hello =>Hello! What are you learning today ?" 
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		
		
		return "Hello! What are you learning today ?";
	}
}
