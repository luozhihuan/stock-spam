package com.whpu.service.stock.spam.service.impl;

import com.whpu.service.stock.spam.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * Created by luozhihuan on 16/3/5.
 */
@Service("testService")
public class TestServiceImpl implements ITestService {

    public void test() {
        System.out.println("ok");
    }

    public void invoke() {

    }
}
