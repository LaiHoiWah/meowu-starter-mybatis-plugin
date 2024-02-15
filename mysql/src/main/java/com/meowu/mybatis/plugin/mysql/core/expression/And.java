package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.ArrayUtils;
import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class And extends Expression{

    public And(){
        super(Operator.AND, ExpressionType.FUNCTION, ValueType.EXPRESSION);
    }

    public void value(Expression... expressions){
        AssertionUtils.isNotEmpty(expressions, "Value list must not be empty");

        setValue(ArrayUtils.toList(expressions));
    }
}
