package com.meowu.mybatis.plugin.commons.core.expression;

import com.meowu.commons.utils.CollectionUtils;
import com.meowu.commons.utils.ReflectionUtils;

import java.util.List;
import java.util.function.Function;

public class Selection{

    private List<String> fields;
    private List<Expression> expressions;

    public Selection(){
        this.fields = CollectionUtils.emptyList();
        this.expressions = CollectionUtils.emptyList();
    }

    public void select(Function function){
        this.fields.add(ReflectionUtils.getFieldName(function));
    }

    public void select(Expression expression){
        this.expressions.add(expression);
    }

    public List<String> getFieldNames(){
        if(CollectionUtils.isEmpty(fields)){
            this.fields.add("*");
        }
        return this.fields;
    }

    public List<Expression> getExpressions(){
        return this.expressions;
    }
}
