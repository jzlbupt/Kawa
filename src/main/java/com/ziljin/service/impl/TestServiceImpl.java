package com.ziljin.service.impl;

import com.ziljin.pojo.Test;
import com.ziljin.mapper.TestMapper;
import com.ziljin.pojo.TestExample;
import com.ziljin.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ziljin on 2017/4/17.
 */
@Component
public class TestServiceImpl implements ITestService{
    @Autowired
    private TestMapper testMapper;

    @Override
    public Test getUserById(Integer id) {
        Test test = testMapper.selectByPrimaryKey(id);
        return test;
    }
    @Override
    public List<Test> getTest() {
        TestExample te = new TestExample();
        List<Test> test = testMapper.selectByExample(te);
        return test;
    }

}

