package com.meowu.mybatis.plugin.mysql.core.expression;

import com.meowu.commons.utils.AssertionUtils;
import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import com.meowu.mybatis.plugin.commons.core.expression.Operator;

import java.util.function.Function;

public class Like extends Operator<String>{

    public Like(Function function){
        AssertionUtils.isNotNull(function, "Getter function must not be null");

        super.setField(ReflectionUtils.getFieldName(function));
        super.setOperator(Constant.OPERATOR_LIKE);
        super.setValueType(Constant.VALUE_TYPE_SINGLE);
    }

    public Like not(){
        super.setOperator(Constant.OPERATOR_NOT_LIKE);
        return this;
    }

    public void value(String value){
        AssertionUtils.isNotBlank(value, "Value must not be null");

        super.setValue(value);
    }

    @Override
    public String getValue(){
        return "%" + super.getValue() + "%";
    }
}
