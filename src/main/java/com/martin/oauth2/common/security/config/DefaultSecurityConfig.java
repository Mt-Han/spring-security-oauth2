package com.martin.oauth2.common.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author martin
 * @description default security config
 * @since 2023.08.31
 **********************************************************************************************************************/
@EnableWebSecurity
public class DefaultSecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.authorizeRequests(authorizeRequests -> authorizeRequests.anyRequest().authenticated());
		http.formLogin();
		
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails user = User.withUsername("user").password("{noop}1234").authorities("ROLE_USER").build();

		return new InMemoryUserDetailsManager(user);
	}
}
