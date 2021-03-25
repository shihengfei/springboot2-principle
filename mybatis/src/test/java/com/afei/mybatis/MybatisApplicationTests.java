package com.afei.mybatis;

import com.afei.mybatis.enums.EmpStatusEnum;
import com.afei.mybatis.mapper.EmpMapper;
import com.afei.mybatis.model.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

	@Autowired
	EmpMapper empMapper;

	@Test
	void contextLoads() {
		List<Emp> emps = empMapper.selectList(1);
		emps.forEach(System.out::println);
	}

	@Test
	void insert() {
		Emp emp = new Emp();
		emp.setName("test2");
		emp.setAge(182);
		emp.setStatus(EmpStatusEnum.LEFT);
		empMapper.insertEmp(emp);
	}

}
