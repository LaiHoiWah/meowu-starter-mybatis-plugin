package com.meowu.mybatis.plugin.mysql.core.expression;

import com.google.common.collect.Lists;
import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class LessThan extends Expression{

    public LessThan(){
        super(Operator.LT, ExpressionType.OPERATION, ValueType.SINGLE);
    }

    public void value(Object value){
        AssertionUtils.isNotNull(value, "Value must not be null");

        setValue(value);
    }
}
