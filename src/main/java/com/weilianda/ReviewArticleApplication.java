package com.weilianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ReviewArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewArticleApplication.class, args);
    }

}
