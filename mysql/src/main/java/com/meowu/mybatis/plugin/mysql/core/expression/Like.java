package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class Like extends Expression{

    public Like(){
        super(Operator.LIKE, ExpressionType.OPERATION, ValueType.SINGLE);
    }

    public Like not(){
        setOperator(Operator.NOT_LIKE);
        return this;
    }

    public void value(String value){
        AssertionUtils.isNotBlank(value, "Value must not be null");

        setValue(Operator.PERCENT_SIGN + value + Operator.PERCENT_SIGN);
    }
}
