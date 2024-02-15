package com.meowu.mybatis.plugin.commons.core.expression;

import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Expression{

    private String field;
    private Object value;

    // operator
    private String operator;

    // expression type
    private ExpressionType expressionType;

    // value type
    private ValueType valueType;

    public Expression(String operator, ExpressionType expressionType, ValueType valueType){
        this.operator       = operator;
        this.expressionType = expressionType;
        this.valueType      = valueType;
    }
}
