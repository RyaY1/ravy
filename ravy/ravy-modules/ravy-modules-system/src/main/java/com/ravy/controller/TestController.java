package com.ravy.controller;

import com.alibaba.fastjson.JSONArray;
import com.ravy.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private ITestService iTestService;

    @GetMapping("/query")
    public List<Map<String,Object>> query(){
        return iTestService.query();
    }
}
