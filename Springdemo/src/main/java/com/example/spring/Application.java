package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public void displayinfo()
        {
            System.out.println("hello"+name);
        }
}
