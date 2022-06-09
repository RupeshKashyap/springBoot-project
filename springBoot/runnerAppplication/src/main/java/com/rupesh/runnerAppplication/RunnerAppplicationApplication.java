package com.rupesh.runnerAppplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerAppplicationApplication implements ApplicationRunner  {

	public static void main(String[] args) {
		SpringApplication.run(RunnerAppplicationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Run Method Executing after application is up");
		
	}

}
