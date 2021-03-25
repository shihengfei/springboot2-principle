package com.afei.mybatis.model;

import com.afei.mybatis.enums.EmpStatusEnum;
import lombok.Data;

import java.util.Date;

@Data
public class Emp {

    private Integer id;

    private String name;

    private Integer age;

    private EmpStatusEnum status;

    private Date gmtCreate;
}
