package com.angular.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Darsh on 6/3/2017.
 */
@ComponentScan
@SpringBootApplication
public class TopicsServiceMain {

    public  static void main(String... args){
        SpringApplication.run(TopicsServiceMain.class,args);
    }
}
