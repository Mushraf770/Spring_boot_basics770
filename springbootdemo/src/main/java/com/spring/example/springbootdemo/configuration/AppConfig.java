package com.spring.example.springbootdemo.configuration;

import com.spring.example.springbootdemo.DB;
import com.spring.example.springbootdemo.DevDB;
import com.spring.example.springbootdemo.ProdDB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDBBean() {
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDBBean() {
        return new ProdDB();
    }

}
