package com.jwth.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jwth.entity.testbo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author maaya
* @description 针对表【test】的数据库操作Mapper
* @createDate 2022-04-10 23:14:15
* @Entity com.jwth.entity.testbo
*/
@Mapper
public interface testboMapper extends BaseMapper<testbo> {

    Page<testbo> findAllByAgeTestbos(Page<testbo> page);
}




