package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class Count extends Expression{

    public Count(){
        super(Operator.COUNT, ExpressionType.FUNCTION, ValueType.NONE);
    }
}
