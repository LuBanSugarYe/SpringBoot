package com.sugar.platform.service.impl;

import org.springframework.stereotype.Service;
import com.sugar.platform.service.DemoService;

/**
 * 测试实现类
 * @Date 2020/04/25
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String test() {
        return "test";
    }
}
