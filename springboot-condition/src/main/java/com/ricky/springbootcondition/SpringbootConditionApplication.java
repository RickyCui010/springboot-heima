package com.ricky.springbootcondition;

import com.ricky.springbootcondition.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);

//        Object redisTemplate = context.getBean("redisTemplate");
//        System.out.println(redisTemplate);

        Object user = context.getBean("user2");
        System.out.println(user);
    }

}
