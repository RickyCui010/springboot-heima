package com.ricky.springbootcondition.config;

import com.ricky.springbootcondition.condtion.ClassCondition;
import com.ricky.springbootcondition.condtion.ConditionOnClass;
import com.ricky.springbootcondition.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class UserConfig {

    @Bean
//    @Conditional(ClassCondition.class)
    @ConditionOnClass("com.alibaba.fastjson.JSON")
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "itcast",havingValue = "itheima")
    public User user2(){
        return new User();
    }

}
