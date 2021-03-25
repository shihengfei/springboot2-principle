package com.afei.mybatis.enums;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shihengfei
 */
@Getter
@AllArgsConstructor
public enum  EmpStatusEnum {

    /** */
    UP(100,"上"),
    DOWN(200,"下"),
    LEFT(300,"左");

    Integer code;

    String msg;

    /**
     * 枚举code与枚举对象map
     */
    public static Map<Integer, EmpStatusEnum> EMP_STATUS_MAP =
            Lists.newArrayList(values()).stream().collect(Collectors.toMap(EmpStatusEnum::getCode, re -> re));

}
