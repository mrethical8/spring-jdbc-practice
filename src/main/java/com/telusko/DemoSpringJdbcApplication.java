package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.model.Alien;
import com.telusko.repo.AlienRepo;

@SpringBootApplication
public class DemoSpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringJdbcApplication.class, args);
		
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(111);
		alien1.setName("Shubham");
		alien1.setTech("Java");
		
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);	
		
		System.out.println(repo.findAll());
		
	}

}
