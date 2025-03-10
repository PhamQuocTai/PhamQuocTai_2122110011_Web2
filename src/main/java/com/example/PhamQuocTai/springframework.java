package com.example.PhamQuocTai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// 1. Data Access/Integration
@Component
class JDBC {
    public JDBC() {
        System.out.println("JDBC initialized");
    }
}

@Component
class ORM {
    public ORM() {
        System.out.println("ORM initialized");
    }
}

@Component
class Transactions {
    public Transactions() {
        System.out.println("Transaction Management initialized");
    }
}

// 2. Web
@Component
class Web {
    public Web() {
        System.out.println("Spring Web initialized");
    }
}

@Component
class WebSocket {
    public WebSocket() {
        System.out.println("WebSocket initialized");
    }
}

// 3. AOP (Aspect-Oriented Programming)
@Component
class AOP {
    public AOP() {
        System.out.println("AOP initialized");
    }
}

// 4. Core Container
@Component
class Beans {
    public Beans() {
        System.out.println("Beans initialized");
    }
}

@Component
class Context {
    public Context() {
        System.out.println("ApplicationContext initialized");
    }
}

// 5. Spring Configuration to load all components
@Configuration
class SpringFrameworkRuntimeConfig {
    @Bean
    public void init() {
        System.out.println("Spring Framework Runtime Started!");
    }
}