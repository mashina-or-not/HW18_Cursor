package com.homework18.hw18.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
@ConditionalOnProperty(prefix = "custom.configuration", name = "enabled", havingValue = "true")
public class Autoconfiguration {
    @Bean
    public void myConfigurationBean() {
        System.out.println("Bean was created");
    }
}