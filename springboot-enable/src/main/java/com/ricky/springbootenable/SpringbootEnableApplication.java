package com.ricky.springbootenable;

import com.ricky.config.EnableUser;
import com.ricky.config.UserConfig;

import com.ricky.domain.Role;
import com.ricky.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;


import java.net.ConnectException;
import java.util.Map;

@SpringBootApplication
//@ComponentScan("com.ricky.config")
//@Import(UserConfig.class)
//@EnableUser
//@Import(User.class)
@Import(UserConfig.class)
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

//        Object user = context.getBean("user");
//        System.out.println(user);

//        User user = context.getBean(User.class);
//        System.out.println(user);
//
//
//        Role role = context.getBean(Role.class);
//        System.out.println(role);

//        Map<String, User> map = context.getBeansOfType(User.class);
//        System.out.println(map);

        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);


    }

}
