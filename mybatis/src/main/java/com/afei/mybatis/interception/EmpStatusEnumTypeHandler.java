package com.afei.mybatis.interception;


import com.afei.mybatis.enums.EmpStatusEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 枚举类型转化
 * @author shihengfei
 */
public class EmpStatusEnumTypeHandler implements TypeHandler<EmpStatusEnum> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, EmpStatusEnum empStatusEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,empStatusEnum.getCode());
    }

    @Override
    public EmpStatusEnum getResult(ResultSet resultSet, String s) throws SQLException {
        String code = resultSet.getString(s);
        // 容错
        if (resultSet.wasNull()) {
            return EmpStatusEnum.UP;
        }
        // 结果转化
        EmpStatusEnum empStatusEnum = EmpStatusEnum.EMP_STATUS_MAP.get(Integer.valueOf(code));
        return empStatusEnum;
    }

    @Override
    public EmpStatusEnum getResult(ResultSet resultSet, int i) throws SQLException {
        int code = resultSet.getInt(i);
        EmpStatusEnum empStatusEnum = EmpStatusEnum.EMP_STATUS_MAP.get(code);
        return empStatusEnum;
    }

    @Override
    public EmpStatusEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        int code = callableStatement.getInt(i);
        EmpStatusEnum empStatusEnum = EmpStatusEnum.EMP_STATUS_MAP.get(code);
        return empStatusEnum;
    }
}
