package com.meowu.mybatis.plugin.mysql.core.expression;

import com.google.common.collect.Lists;
import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

import java.util.List;

public class In extends Expression{

    public In(){
        super(Operator.IN, ExpressionType.FUNCTION, ValueType.MULTIPLE);
    }

    public In not(){
        setOperator(Operator.NOT_IN);
        return this;
    }

    public void value(List value){
        AssertionUtils.isNotEmpty(value, "Value list must not be empty");

        setValue(value);
    }
}
