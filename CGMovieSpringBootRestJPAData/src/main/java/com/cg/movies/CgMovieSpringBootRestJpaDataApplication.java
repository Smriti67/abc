package com.cg.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages= {"com.cg.movies"})
@EntityScan(basePackages="com.cg.movies.beans")
@EnableJpaRepositories(basePackages="com.cg.movies.daoservices")
@EnableWebMvc
public class CgMovieSpringBootRestJpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgMovieSpringBootRestJpaDataApplication.class, args);
	}

}
