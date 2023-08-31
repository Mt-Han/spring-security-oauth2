//package com.martin.oauth2.common.security.config;
//
//import lombok.SneakyThrows;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.core.oidc.OidcScopes;
//import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
//import org.springframework.security.oauth2.server.authorization.config.ClientSettings;
//import org.springframework.security.oauth2.server.authorization.config.ProviderSettings;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.Set;
//import java.util.UUID;
//
///**
// * @author martin
// * @description authorization server configuration
// * @since 2023.08.30
// **********************************************************************************************************************/
////@Configuration
//public class AuthorizationServerConfiguration2 {
//
//	@Bean
//	@SneakyThrows
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
//
//		OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);
//
//		return http.build();
//	}
//
//	@Bean
//	public ProviderSettings providerSettings() {
//		return ProviderSettings.builder()
//				.issuer("http://localhost:9000")
//				.build();
//	}
//
//	@Bean
//	public RegisteredClientRepository registeredClientRepository() {
//		RegisteredClient registeredClient = RegisteredClient.withId(UUID.randomUUID().toString())
//				.clientId("oauth2-client-app")
//				.clientSecret("{noop}secret")
//				.clientAuthenticationMethods(clientAuthenticationMethods -> clientAuthenticationMethods.addAll(Set.of(ClientAuthenticationMethod.CLIENT_SECRET_BASIC, ClientAuthenticationMethod.NONE)))
//				.authorizationGrantTypes(authorizationGrantTypes -> authorizationGrantTypes.addAll(Set.of(AuthorizationGrantType.AUTHORIZATION_CODE, AuthorizationGrantType.REFRESH_TOKEN, AuthorizationGrantType.CLIENT_CREDENTIALS)))
//				.redirectUris(strings -> strings.addAll(Set.of("http://127.0.0.1:8081/login/oauth2/code/oauth2-client-app", "http://127.0.0.1:8081")))
//				.scopes(strings -> strings.addAll(Set.of(OidcScopes.OPENID, "message.read", "message.write")))
//				.clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
//				.build();
//
//		InMemoryRegisteredClientRepository registeredClientRepository = new InMemoryRegisteredClientRepository(registeredClient);
//
//		return registeredClientRepository;
//	}
//}
