package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import com.meowu.mybatis.plugin.commons.core.expression.Operator;

import java.util.function.Function;

public class LessEqual extends Operator<Object>{

    public LessEqual(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");

        super.setField(ReflectionUtils.getFieldName(function));
        super.setOperator(Constant.OPERATOR_LESS_EQUAL);
        super.setValueType(Constant.VALUE_TYPE_SINGLE);
    }

    public void value(Object value){
        AssertionUtils.isNotNull(value, "Value must not be null");

        super.setValue(value);
    }
}
