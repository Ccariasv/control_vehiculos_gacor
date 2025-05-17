package com.gacor.control_vehiculos_gacor;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Deshabilita CSRF (solo en desarrollo)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()  // Permite TODO
                );
        return http.build();
    }
}