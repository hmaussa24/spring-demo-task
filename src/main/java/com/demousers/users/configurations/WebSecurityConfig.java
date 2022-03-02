package com.demousers.users.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.stores.stores.security.JWTAuthorizationFilter;

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
			.authorizeRequests()
			.antMatchers(HttpMethod.POST, "/api/tasks/*").permitAll()
			.antMatchers(HttpMethod.GET, "/api/tasks/*").permitAll()
			.antMatchers(HttpMethod.GET, "/api/tasks/*/*").permitAll()
			.antMatchers(HttpMethod.GET, "/").permitAll()
			.antMatchers(HttpMethod.POST, "/api/users/*").permitAll()
			.antMatchers(HttpMethod.GET, "/api/users/*").permitAll()
			.anyRequest().authenticated();
		http.cors();
	}
}