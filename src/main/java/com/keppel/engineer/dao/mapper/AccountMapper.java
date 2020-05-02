package com.keppel.engineer.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface AccountMapper {
    int login(@Param("name")String name, @Param("password")String password);
}
