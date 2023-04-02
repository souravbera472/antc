package com.antc;

import com.loggin.KLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AntcApplication {

	public static void main(String[] args) {
		KLogger.info("Server started in 30 sec.");
		SpringApplication.run(AntcApplication.class, args);
	}

}
