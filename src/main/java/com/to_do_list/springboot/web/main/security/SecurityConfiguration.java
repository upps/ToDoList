package com.to_do_list.springboot.web.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Bean
	public UserDetailsService userDetailsService() {
		User.UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("admin").password("123").roles("USER","ADMIN").build());
		manager.createUser(users.username("user").password("123").roles("USER").build());
		return manager;
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests().antMatchers("/login").permitAll()
		.antMatchers("/","/*todo*/**").access("hasRole('USER')").and()
		.formLogin();
		
		http.authorizeRequests().antMatchers("/h2/**").access("hasRole('ADMIN')").and()
		.formLogin();
		
        http.csrf().disable();
        http.headers().frameOptions().disable();
	}
}
