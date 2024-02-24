package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import com.meowu.mybatis.plugin.commons.core.expression.Functional;

import java.util.List;
import java.util.function.Function;

public class In extends Functional<List>{

    public In(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");

        super.setField(ReflectionUtils.getFieldName(function));
        super.setOperator(Constant.OPERATOR_IN);
        super.setValueType(Constant.VALUE_TYPE_MULTI);
    }

    public In not(){
        super.setOperator(Constant.OPERATOR_NOT_IN);
        return this;
    }

    public void value(List value){
        AssertionUtils.isNotEmpty(value, "Value must not be null");

        super.setValue(value);
    }
}
