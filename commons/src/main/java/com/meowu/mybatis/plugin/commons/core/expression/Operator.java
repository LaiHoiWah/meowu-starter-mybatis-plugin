package com.meowu.mybatis.plugin.commons.core.expression;

import com.meowu.mybatis.plugin.commons.core.constants.Constant;

public class Operator<T> extends Expression<T>{

    @Override
    public String getExpressionType(){
        return Constant.EXPRESSION_TYPE_OPERATOR;
    }
}
