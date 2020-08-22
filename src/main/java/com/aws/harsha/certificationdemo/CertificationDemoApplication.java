package com.aws.harsha.certificationdemo;

import com.aws.harsha.certificationdemo.model.DemoRequest;
import com.aws.harsha.certificationdemo.model.DemoResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class CertificationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificationDemoApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<String, String> lowerCase() {
		return value -> value.toLowerCase();
	}

//	@Bean
//	public Function<DemoRequest, DemoResponse> getname() {
//
//	}
}
