package com.meowu.mybatis.plugin.mysql.core.expression;

import com.google.common.collect.Lists;
import com.meowu.commons.utils.AssertionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.ExpressionType;
import com.meowu.mybatis.plugin.commons.core.constants.ValueType;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.constants.Operator;

public class Limit extends Expression{

    public Limit(){
        super(Operator.LIMIT, ExpressionType.FUNCTION, ValueType.MULTIPLE);
    }

    public void value(int offset, int size){
        AssertionUtils.isTrue(offset >= 0, "Offset must be greater than and equal 0");
        AssertionUtils.isNotNull(size > 0, "Size must be be greater than 0");

        setValue(Lists.newArrayList(offset, size));
    }
}
