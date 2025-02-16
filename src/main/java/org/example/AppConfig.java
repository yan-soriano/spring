package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public engine engine() {return new engine();}
    @Bean
    public driver driver() {return new driver();}
    @Bean
    public car car(engine engine, driver driver) {return new car(driver, engine);}
}
