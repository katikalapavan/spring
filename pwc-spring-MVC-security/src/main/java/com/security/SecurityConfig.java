package com.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
@Override
protected void configure(HttpSecurity http)throws Exception{
//	http.authorizeRequests().antMatchers("/mainapp/*").permitAll();
	http.httpBasic().and().authorizeRequests()
	.antMatchers(HttpMethod.GET,"/mainapp/**").hasRole("USER")
	.antMatchers(HttpMethod.GET,"/users/**").hasRole("ADMIN")
	.and().csrf().disable().formLogin().disable();
	
}

@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	// TODO Auto-generated method stub
	//super.configure(auth);
	auth.inMemoryAuthentication()
	.withUser("user").password("{noop}mypass").roles("USER")
	.and().withUser("admin").password("{noop}myadmin").roles("ADMIN");
}

}
