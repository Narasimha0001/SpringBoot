package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
		int a = 5;
	@GetMapping("/")
	public String Hello() {
		String message = "Hello world, this is Narasimha";
 
        
        int unusedVariable = 100;
 
        
        if (message.equals("Hello world, this is Narasimha")) {
            System.out.println("Message is correct");
        }
 
        if (message.equals("Hello world, this is Narasimha")) {
            System.out.println("Message is correct");
        }
 

		return "Hello world, this is Narasimha!";
	}



	


}
