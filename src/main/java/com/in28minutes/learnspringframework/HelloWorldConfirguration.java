package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) { };
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
        return new Person("Ravi", 20, new Address("sector 52", "Noida"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address3){
        return new Person(name, age, address3);
    }


//  Expected single matching bean but found 2: address2, address3 - we use @primary
    @Bean
    public Person person4Parameter(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name, age, address);
    }

    @Primary
    @Bean (name = "address2")
    public Address address(){
        return new Address("Kamla Nagar", "Agra");
    }

    @Bean (name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Kalyanpur", "Kanpur");
    }
}
