package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity		// 모든 웹 설정을 바꿔줌
public class WebSecurityConfig {

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(9);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests	// 인가체크
				.requestMatchers("/", "/home", "/css/*", "/js/*", "/assets/*")
				.permitAll().requestMatchers("/admin/*", "/empMain").hasRole("ADMIN")	//admin권한만 접근가능
				.anyRequest().authenticated()	//로그인해야 접근가능
				)	
				.formLogin((form) -> form.permitAll()
						.loginPage("/login")
						//.usernameParameter("userid")
						//.successForwardUrl("/empMain"))
				.logout((logout) -> logout.deleteCookies("JSESSIONID").permitAll())
			
				//.csrf((csrf) -> csrf.ignoringRequestMatchers("/api/*"));
				.csrf(csrf -> csrf.disable());
				;

			return http.build();
		}

} // end of class
