package com.ricky.springbootmybatis.mapper;

import com.ricky.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {

    public List<User> findAll();
}
