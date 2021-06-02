package com.yans.sb.manager.controller;


import com.yans.sb.manager.entity.TestEntity;
import com.yans.sb.manager.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "控制层")
@RestController
@RequestMapping("/manager/test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation("test方法")
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id) {
        System.out.println("id:" + id);
        return testService.getById(id);
    }

}