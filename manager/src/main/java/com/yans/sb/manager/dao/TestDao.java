package com.yans.sb.manager.dao;

import com.yans.sb.manager.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}