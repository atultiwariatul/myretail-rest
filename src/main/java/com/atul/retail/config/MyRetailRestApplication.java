package com.atul.retail.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Main Configuration file for spring boot application which will provide out of the box implementation
 * for Test, Rest, Servlet Container (Tomcat), mongodb, logback. This application will Try to
 * Utilize already exposed feature of Spring Boot.
 * Created by atiwa00 on 6/4/16.
 */
@SpringBootApplication
@EnableAspectJAutoProxy(
		proxyTargetClass = true
)
@EnableMongoAuditing
@EnableMongoRepositories(value = {"com.atul.retail"})
public class MyRetailRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRetailRestApplication.class, args);
	}
}
