package com.library.bookDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.library.service.BookRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.library.controller","com.library.service","com.library.impl"})
@EntityScan("com.library.beans")
@EnableJpaRepositories (basePackageClasses = {BookRepository.class})
public class BookDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsApplication.class, args);
	}

}
