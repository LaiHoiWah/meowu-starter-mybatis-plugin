package com.meowu.mybatis.plugin.mysql.core.expression;

import com.google.common.collect.Lists;
import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import com.meowu.mybatis.plugin.commons.core.expression.Functional;

import java.util.List;
import java.util.function.Function;

public class Between extends Functional<List>{

    public Between(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");

        super.setField(ReflectionUtils.getFieldName(function));
        super.setOperator(Constant.OPERATOR_BETWEEN);
        super.setValueType(Constant.VALUE_TYPE_MULTI);
    }

    public Between not(){
        super.setOperator(Constant.OPERATOR_NOT_BETWEEN);
        return this;
    }

    public void value(Object min, Object max){
        AssertionUtils.isNotNull(min, "Value must not be null");
        AssertionUtils.isNotNull(max, "Value must not be null");

        super.setValue(Lists.newArrayList(min, max));
    }
}
