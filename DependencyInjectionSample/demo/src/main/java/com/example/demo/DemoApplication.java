package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter03.used.Greet;

/**
* 스프링 부트 기동 클래스
*/
@SpringBootApplication
public class DemoApplication {
    /**
    * main 메서드
    * @param args
    */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args)
           .getBean(DemoApplication.class).execute();
    }

    /**
    * 주입하는 곳(인터페이스)
    */
    @Autowired
    Greet greet;

    /**
    * 실행 메서드
    */
    private void execute() {
        greet.greeting();
    }
}