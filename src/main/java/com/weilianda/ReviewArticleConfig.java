package com.weilianda;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

/**
 * @author LLF
 * @date 2019/8/2 - 16:13
 */
@SpringBootConfiguration
public class ReviewArticleConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("ActiveMQQueue");
    }
}
