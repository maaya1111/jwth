package com.jwth.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jwth.entity.testbo;
import com.jwth.service.testboService;
import com.jwth.mapper.testboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author maaya
* @description 针对表【test】的数据库操作Service实现
* @createDate 2022-04-10 23:06:05
*/
@Service
@Transactional
public class testboServiceImpl extends ServiceImpl<testboMapper, testbo>
    implements testboService{

    @Autowired testboMapper testboMapper;

    @Autowired test tt;

    @Override
    public Page<testbo> findAll() {
        testbo tb=new testbo();
        tb.setId(8);
        tb.setName("猫1");
        tb.setAge(85);
        save(tb);
        return testboMapper.findAllByAgeTestbos(new Page<testbo>(2,2));
    }

    @Override
    @Async
    public void lookLook() {
        testbo tb=new testbo();
        tb.setId(8);
        tb.setName("张思雨屁股大");
        tb.setAge(85);
        save(tb);
        try {
            Thread.sleep(80000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}




