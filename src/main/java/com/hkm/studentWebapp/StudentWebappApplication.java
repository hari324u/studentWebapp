package com.hkm.studentWebapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.hkm"})
@EnableJpaRepositories(basePackages = "com.hkm.repository")
@EntityScan(basePackages = "com.hkm.domain")
public class StudentWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWebappApplication.class, args);
	}

}
