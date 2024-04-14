package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };
record Address (String firstline, String city) { };

@Configuration
public class HelloWorldConfirguration {

    @Bean
    public  String name(){
        return "Abhay";
    }

    @Bean
    public  int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20);
    }

    @Bean
    public Address address(){
        return new Address("Kamla Nagar", "Agra");
    }
}
