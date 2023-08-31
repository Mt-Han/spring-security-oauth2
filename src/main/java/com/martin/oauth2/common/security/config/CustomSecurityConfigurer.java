//package com.martin.oauth2.common.security.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//
///**
// * @author martin
// * @description custom security configurer
// * @since 2023.08.29
// **********************************************************************************************************************/
//public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity> {
//
//	private boolean isSecure;
//
//	@Override
//	public void init(HttpSecurity builder) throws Exception {
//		super.init(builder);
//		System.out.println("init method starting...");
//	}
//
//	@Override
//	public void configure(HttpSecurity builder) throws Exception {
//		super.configure(builder);
//		System.out.println("configure method starting...");
//
//		if(isSecure) {
//			System.out.println("https is required");
//		} else {
//			System.out.println("https is optional");
//		}
//	}
//
//	public CustomSecurityConfigurer setFlag(boolean isSecure) {
//		this.isSecure = isSecure;
//		return this;
//	}
//}
