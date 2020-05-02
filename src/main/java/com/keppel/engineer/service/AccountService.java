package com.keppel.engineer.service;

import org.springframework.stereotype.Service;

import java.util.Map;

public interface AccountService {
    String login(Map<String, String> params);
}
