package com.jwth.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jwth.entity.testbo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author maaya
* @description 针对表【test】的数据库操作Service
* @createDate 2022-04-10 23:14:15
*/
public interface testboService extends IService<testbo> {
    Page<testbo> findAll();

    void lookLook();
}
