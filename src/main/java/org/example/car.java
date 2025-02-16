package org.example;

import org.springframework.context.annotation.Configuration;

@Configuration
public class car {
    private engine engine;
    private driver driver;

    public car(org.example.driver driver, org.example.engine engine) {
        this.driver = driver;
        this.engine = engine;
    }
    public void start(){
        System.out.println("Car is starting...");
        engine.run();
        driver.drive();
    }
}
