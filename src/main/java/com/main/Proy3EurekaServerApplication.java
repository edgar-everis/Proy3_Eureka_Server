package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Proy3EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proy3EurekaServerApplication.class, args);
	}

}
