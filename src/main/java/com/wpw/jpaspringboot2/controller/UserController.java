package com.wpw.jpaspringboot2.controller;

import com.alibaba.fastjson.JSON;
import com.wpw.jpaspringboot2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wpw
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/getUserCompanyList")
    public String getUserCompanyList() {
        List<Map<String, Object>> userCompanyList = userRepository.getUserCompanyList();
        String jsonString = JSON.toJSONString(userCompanyList);
        return jsonString;
    }
}
