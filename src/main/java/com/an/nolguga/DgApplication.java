package com.an.nolguga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DgApplication {

    public static void main(String[] args) {
        SpringApplication.run(DgApplication.class, args);
    }
}


