package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import com.meowu.mybatis.plugin.commons.core.expression.Operator;

import java.util.function.Function;

public class Equal extends Operator<Object>{

    public Equal(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");

        super.setField(ReflectionUtils.getFieldName(function));
        super.setOperator(Constant.OPERATOR_EQUAL);
        super.setValueType(Constant.VALUE_TYPE_SINGLE);
    }

    public Equal not(){
        super.setOperator(Constant.OPERATOR_NOT_EQUAL);
        return this;
    }

    public void value(Object value){
        AssertionUtils.isNotNull(value, "Value must not be null");

        super.setValue(value);
    }
}
