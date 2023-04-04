package com.ricky.springbootenable;

import com.ricky.config.EnableUser;
import com.ricky.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan("com.ricky.config")
//@Import(UserConfig.class)
@EnableUser
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

        Object user = context.getBean("user");
        System.out.println(user);
    }

}
