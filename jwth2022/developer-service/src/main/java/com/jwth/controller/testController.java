package com.jwth.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jwth.entity.testbo;
import com.jwth.service.impl.test;
import com.jwth.service.testboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {


    @Autowired
    private testboService testboService;

    @Autowired
    private test tt;

    @RequestMapping
    public String test() throws InterruptedException {
        /*testbo tb=new testbo();
        tb.setId(8);
        tb.setName("张2");
        tb.setAge(85);
        testboService.save(tb);*/
        testboService.lookLook();
        tt.test();
        return "啦啦啦";
    }
}
