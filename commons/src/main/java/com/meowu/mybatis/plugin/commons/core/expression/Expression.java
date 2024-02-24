package com.meowu.mybatis.plugin.commons.core.expression;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PROTECTED)
public class Expression<T>{

    private T value;
    private String field;
    private String operator;
    private String valueType;
    private String expressionType;
}
