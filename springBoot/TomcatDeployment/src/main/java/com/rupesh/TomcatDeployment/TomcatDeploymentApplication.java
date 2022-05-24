package com.rupesh.TomcatDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomcatDeploymentApplication extends SpringBootServletInitializer {

	/*
	 * @Author Rupesh Kashyap
	 * The code for Spring Boot Application class file for JAR file deployment is
	 * given below −
	 */	public static void main(String[] args) {
		SpringApplication.run(TomcatDeploymentApplication.class, args);
	}
	 
	/*
	 * @Author Rupesh Kashyap
	 * We need to extend the class SpringBootServletInitializer to support WAR file
	 * deployment. The code of Spring Boot Application class file is given below
	 */	 
	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(TomcatDeploymentApplication.class );
	}
	 
	 @RequestMapping(value = "/")
	   public String hello() {
	      return "Hello World from Tomcat";
	   }

}
