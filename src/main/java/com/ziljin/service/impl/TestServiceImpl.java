package com.ziljin.service.impl;

import com.ziljin.pojo.Test;
import com.ziljin.mapper.TestMapper;
import com.ziljin.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

}

