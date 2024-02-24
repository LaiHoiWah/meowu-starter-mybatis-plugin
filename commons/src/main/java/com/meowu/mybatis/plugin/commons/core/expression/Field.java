package com.meowu.mybatis.plugin.commons.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import lombok.Getter;

import java.util.function.Function;

@Getter
public class Field{

    private String name;

    public Field(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");
        this.name = ReflectionUtils.getFieldName(function);
    }

    public Field(String name){
        AssertionUtils.isNotBlank(name, "Field must not be null");
    }
}
