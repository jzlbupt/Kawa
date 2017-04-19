package com.ziljin.controller;

import com.alibaba.fastjson.JSON;
import com.ziljin.pojo.Test;
import com.ziljin.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ziljin on 2017/4/17.
 */
@RestController
public class TestController {
    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getUserById(Integer id){
        Test user=testService.getUserById(id);
        String testStr= JSON.toJSONString(user);
        return testStr;
    }

    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    public List<Test> getTest() {
        List<Test> tests= testService.getTest();
        String testStr = JSON.toJSONString(tests);
        return tests;
    }
}
