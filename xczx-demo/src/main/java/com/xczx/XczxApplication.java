package com.xczx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class XczxApplication {

	public static void main(String[] args) {
		SpringApplication.run(XczxApplication.class, args);
		System.out.println("demo");
	}
}
