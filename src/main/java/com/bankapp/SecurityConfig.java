package com.bankapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/about").authenticated()
		.antMatchers("/contact").authenticated()
		.and().formLogin() //own login page URL we can write here
		.and().httpBasic();
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		       .withUser("neha").password("root").authorities("Admin").and()
		       .withUser("gayathri").password("g@ya3").authorities("User").and()
		       .withUser("rama").password("r@ma").authorities("User").and()
		       .withUser("karthik").password("k@rtha").authorities("User").and()
		       .withUser("bunny").password("bunny").authorities("User").and()
		       .passwordEncoder(NoOpPasswordEncoder.getInstance());
		       
	}
	
	
}
