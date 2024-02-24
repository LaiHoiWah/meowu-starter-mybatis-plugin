package com.meowu.mybatis.plugin.mysql.core.criteria;

import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.mysql.core.expression.*;

import java.util.function.Function;

public class Restrictions{

    private Restrictions(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static Expression equal(Function function){
        return new Equal(function);
    }

    public static Expression like(Function function){
         return new Like(function);
    }

    public static Expression less(Function function){
        return new Less(function);
    }

    public static Expression lessEqual(Function function){
        return new LessEqual(function);
    }

    public static Expression between(Function function){
        return new Between(function);
    }

    public static Expression in(Function function){
        return new In(function);
    }

    public static Expression isNull(Function function){
        return new IsNull(function);
    }
}
