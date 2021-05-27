package com.ravy.service.Impl;

import com.alibaba.fastjson.JSONArray;
import com.ravy.mapper.TestMapper;
import com.ravy.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Map<String,Object>> query() {
        return testMapper.query();
    }
}
