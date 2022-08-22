package com.example.securitydeprecatedwithmockuser;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/secret").hasAuthority("ADMIN")
                .antMatchers("/pub").hasAuthority("BASIC")
                .anyRequest().denyAll()
                .and().httpBasic();
        return http.build();
    }
}
