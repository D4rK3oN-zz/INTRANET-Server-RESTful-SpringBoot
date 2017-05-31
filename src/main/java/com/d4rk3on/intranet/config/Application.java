package com.d4rk3on.intranet.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Spring boot application initializer
 * 
 * @author javier.moreno
 *
 */
@SpringBootApplication(scanBasePackages = "com.d4rk3on.intranet")
@EnableMongoRepositories({ "com.d4rk3on.intranet.*.repository" })
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	/**
	 * Application main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
