package com.meowu.mybatis.plugin.commons.core.expression;

import com.meowu.mybatis.plugin.commons.core.constants.Constant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Functional<T> extends Expression<T>{

    @Override
    public String getExpressionType(){
        return Constant.EXPRESSION_TYPE_FUNCTION;
    }
}
