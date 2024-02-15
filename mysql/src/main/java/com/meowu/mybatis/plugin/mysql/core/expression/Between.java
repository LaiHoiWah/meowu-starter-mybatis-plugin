package com.meowu.mybatis.plugin.mysql.core.expression;

import com.google.common.collect.Lists;
import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class Between extends Expression{

    public Between(){
        super(Operator.BETWEEN, ExpressionType.FUNCTION, ValueType.MULTIPLE);
    }

    public Between not(){
        setOperator(Operator.NOT_BETWEEN);
        return this;
    }

    public void value(Object minimum, Object maximum){
        AssertionUtils.isNotNull(minimum, "Minimum value must not be null");
        AssertionUtils.isNotNull(maximum, "Maximum value must not be null");

        setValue(Lists.newArrayList(minimum, maximum));
    }
}
