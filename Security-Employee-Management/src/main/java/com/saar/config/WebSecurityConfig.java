package com.saar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain ( HttpSecurity httpSecurity) {
		httpSecurity.authorizeHttpRequests(auth -> auth.
//				Anyone Can Access api who's start with employee/***
//				requestMatchers("/employees/**").permitAll()
				
	// Now to fetch any api starts with /employee need to authenticate			
				requestMatchers("/employees/**").authenticated()
				).formLogin(Customizer.withDefaults());
		return  httpSecurity.build();
	}
}
