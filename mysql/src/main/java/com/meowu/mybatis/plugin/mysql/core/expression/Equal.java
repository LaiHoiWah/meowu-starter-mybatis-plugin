package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class Equal extends Expression{

    public Equal(){
        super(Operator.EQ, ExpressionType.OPERATION, ValueType.SINGLE);
    }

    public Equal not(){
        setOperator(Operator.NEQ);
        return this;
    }

    public void value(Object value){
        AssertionUtils.isNotNull(value, "Value must not be null");

        setValue(value);
    }
}
