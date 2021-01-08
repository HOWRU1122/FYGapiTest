package com.jourwon.httpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description: springboot启动类
 *
 */

@SpringBootApplication
@ComponentScan("com.jourwon")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
