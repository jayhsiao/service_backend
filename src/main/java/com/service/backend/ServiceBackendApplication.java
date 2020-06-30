package com.service.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.service.backend")
@Configuration
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.service.backend.repository")
@EntityScan(basePackages = "com.service.backend.model")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ServiceBackendApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceBackendApplication.class, args);
    }
}
