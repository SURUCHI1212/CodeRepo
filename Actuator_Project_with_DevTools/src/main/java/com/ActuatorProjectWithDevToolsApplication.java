package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorProjectWithDevToolsApplication {

	public static void main(String[] args) {
		System.out.println("this is /spring boot Actuator project");
		SpringApplication.run(ActuatorProjectWithDevToolsApplication.class, args);
	}

}
