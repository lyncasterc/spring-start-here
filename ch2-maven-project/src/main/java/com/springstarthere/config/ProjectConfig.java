package com.springstarthere.config;

import com.springstarthere.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");

        return p;
    }
}
