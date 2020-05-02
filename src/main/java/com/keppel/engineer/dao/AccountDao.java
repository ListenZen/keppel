package com.keppel.engineer.dao;

import com.keppel.engineer.dao.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AccountDao {
    @Autowired
    private AccountMapper accountMapper;

    public int login(String name, String password) {
        return accountMapper.login(name, password);
    }
}
