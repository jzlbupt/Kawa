package com.ziljin.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.ziljin.pojo.Test;
/**
 * Created by ziljin on 2017/4/17.
 */
public interface ITestService {
    Test getUserById(Integer id);
}
