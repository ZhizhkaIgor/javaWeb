package com.SenderSms.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = { "/Service",
 								"/Config",
								"/controller"})
public class SenderSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenderSmsApplication.class, args);
	}
	
}
