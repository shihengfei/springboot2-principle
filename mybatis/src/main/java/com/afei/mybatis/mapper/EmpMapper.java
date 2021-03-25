package com.afei.mybatis.mapper;

import com.afei.mybatis.model.Emp;

import java.util.List;

public interface EmpMapper {

    List<Emp> selectList(Integer id);

    void insertEmp(Emp emp);
}
