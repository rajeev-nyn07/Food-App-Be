package com.nineleaps.foodtechapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/users/{userID}").hasRole("VENDOR")
            .antMatchers("/users/{vendorId}").hasRole("VENDOR")
            .antMatchers("/users/{vendorId}").hasRole("VENDOR")
            .antMatchers("/employee/**").hasRole("EMPLOYEE")
            .antMatchers("/api/endpoint").hasIpAddress("127.0.0.1")
            .anyRequest().authenticated()
            .and().csrf().disable()
            .httpBasic();
        
    }
 
    // other security configuration methods
}
