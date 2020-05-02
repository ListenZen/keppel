package com.keppel.engineer.controller;

import com.keppel.engineer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/account")
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    public String startTestController(@RequestBody Map<String, String> params) {
        String result = accountService.login(params);
        return result;
    }
}
