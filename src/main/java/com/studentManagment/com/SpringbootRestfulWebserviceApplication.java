package com.studentManagment.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages =  "com.studentManagment.com")
public class SpringbootRestfulWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebserviceApplication.class, args);
	}

}
