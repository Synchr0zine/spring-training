package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PCConfig {

    @Bean
    public Case caseDell(){
        Dimensions dimensions = new Dimensions(50,10,10);
        return new DellCase("220B","Dell","240", dimensions);
    }

}
