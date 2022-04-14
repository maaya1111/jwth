package com.jwth.service.impl;

import com.jwth.entity.testbo;
import com.jwth.mapper.testboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class test {
    @Autowired
    private testboMapper testboMapper;


    @Async
    public void test(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<testbo> testbos = testboMapper.selectList(null);
        System.out.println("sss");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<testbo> testbos11 = testboMapper.selectList(null);
        System.out.println("sss");
    }
}
