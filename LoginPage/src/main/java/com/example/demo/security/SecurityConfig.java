package com.example.demo.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails lavanya = User.builder()
                .username("lavanya")
                .password("{noop}lav123")
                .roles("ADMIN")
                .build();
        UserDetails lavan = User.builder()
                .username("lavan")
                .password("{noop}lavan123")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(lavanya,lavan);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                        configurer.anyRequest().authenticated())
                .formLogin(form ->
                        form.loginPage("/login")
                                .loginProcessingUrl("/processlogin")
                                .permitAll()
                                .defaultSuccessUrl("/welcome", true)
                );
        return http.build();
    }
}

