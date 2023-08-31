//package com.martin.oauth2.common.security.config;
//
//import lombok.SneakyThrows;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configurers.oauth2.server.authorization.OAuth2AuthorizationServerConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
///**
// * @author martin
// * @description security config
// * @since 2023.08.29
// **********************************************************************************************************************/
////@Configuration
//public class SecurityConfig {
//
//	@Bean
//	@SneakyThrows
//	SecurityFilterChain securityFilterChain(HttpSecurity http) {
//		http.authorizeRequests().anyRequest().authenticated();
//		http.formLogin();
//		http.apply(new CustomSecurityConfigurer().setFlag(true));
////		OAuth2AuthorizationServerConfigurer<>
//
//		return new OAuth2AuthorizationServerConfiguration()
//				.authorizationServerSecurityFilterChain(http);
//	}
//}
