package com.keppel.engineer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.keppel.engineer.dao.AccountDao;
import com.keppel.engineer.service.AccountService;
import com.keppel.engineer.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public String login(Map<String, String> params) {
        String name = params.get("name");
        String password = params.get("password");
        int result = accountDao.login(name, password);
        if (result > 0) {
            return Constant.SUCCESS;
        }
        return Constant.FAIL;
    }
}
