package com.vw.CertificateManager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/h2-console/**").permitAll() // H2-Konsole ohne Authentifizierung zugänglich machen
                        .anyRequest().authenticated() // Andere Endpoints benötigen Login
                )
                .csrf(csrf -> csrf.disable()) // CSRF-Schutz für H2-Konsole deaktivieren (wird sonst blockiert)
                .headers(headers -> headers.frameOptions().disable()); // Frames für die H2-Konsole aktivieren

        return http.build();
    }
}