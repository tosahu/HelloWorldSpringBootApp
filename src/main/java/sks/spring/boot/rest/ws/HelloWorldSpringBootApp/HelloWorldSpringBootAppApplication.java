package sks.spring.boot.rest.ws.HelloWorldSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldSpringBootAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootAppApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloWorldSpringBootAppApplication.class);
	}
	
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello  World" ;
	}
	
	@GetMapping("/")
	public String sayHi() {
		
		return "Hello  Welcome to jenkins. ya hu..." ;
	}
	
}
