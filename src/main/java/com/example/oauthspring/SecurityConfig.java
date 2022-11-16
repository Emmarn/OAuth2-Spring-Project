package com.example.oauthspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
        throws Exception
    {
        return http
                .oauth2Login()
                .successHandler(new HandleAuth())
                .and()
                .authorizeRequests()
                .antMatchers("/user")
                .authenticated()
                .antMatchers("/**")
                .permitAll()
                .and()
                .build();
    }
}
