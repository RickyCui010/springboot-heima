package com.ricky.springbootmybatis;

import com.ricky.springbootmybatis.domain.User;
import com.ricky.springbootmybatis.mapper.UserMapper;
import com.ricky.springbootmybatis.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserXmlMapper userXmlMapper;



    @Test
    public void testFindAll() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }
    @Test
    public void testFindAll2() {
        List<User> list = userXmlMapper.findAll();
        System.out.println(list);
    }

}
