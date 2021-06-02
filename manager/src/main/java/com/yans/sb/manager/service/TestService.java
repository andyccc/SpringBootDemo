package com.yans.sb.manager.service;


import com.yans.sb.manager.dao.TestDao;
import com.yans.sb.manager.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}