package com.souvik.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.souvik.org.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaAuthenticationApplication.class, args);
	}

}
