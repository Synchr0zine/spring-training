package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringIntegerConfig {

    @Bean
    public String myString(){
        return "Baturay";
    }

    @Bean
    public Integer myInteger(){
        return 5;
    }
}
