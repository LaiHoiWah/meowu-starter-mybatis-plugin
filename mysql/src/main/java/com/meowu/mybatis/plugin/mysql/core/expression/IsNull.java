package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import com.meowu.mybatis.plugin.commons.core.expression.Operator;

import java.util.function.Function;

public class IsNull extends Operator{

    public IsNull(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");

        super.setField(ReflectionUtils.getFieldName(function));
        super.setOperator(Constant.OPERATOR_IS_NULL);
        super.setValueType(Constant.VALUE_TYPE_NONE);
    }

    public IsNull not(){
        super.setOperator(Constant.OPERATOR_IS_NOT_NULL);
        return this;
    }
}
