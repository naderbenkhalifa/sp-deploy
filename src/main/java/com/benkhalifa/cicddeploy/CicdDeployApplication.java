package com.benkhalifa.cicddeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDeployApplication {
	 @GetMapping("/webapp/home")
	 public String home() {
		 return "Welcome To Docker1!";
	 }

	public static void main(String[] args) {
		SpringApplication.run(CicdDeployApplication.class, args);
	}

}
