package com.yans.sb.manager.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("TestEntity实体类")
public class TestEntity {

    @ApiModelProperty("id 字段")
    protected Integer id;

    @ApiModelProperty("magicId 字段")
    protected String magicId;

    @ApiModelProperty("firstName 字段")
    protected String firstName;

    @ApiModelProperty("lastName 字段")
    protected String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagicId() {
        return magicId;
    }

    public void setMagicId(String magicId) {
        this.magicId = magicId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}