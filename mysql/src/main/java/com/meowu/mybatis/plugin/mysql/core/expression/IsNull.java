package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class IsNull extends Expression{

    public IsNull(){
        super(Operator.IS_NULL, ExpressionType.OPERATION, ValueType.NONE);
    }

    public IsNull not(){
        setOperator(Operator.NOT_NULL);
        return this;
    }
}
