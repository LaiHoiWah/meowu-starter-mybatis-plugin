package com.meowu.mybatis.plugin.mysql.core.criteria;

import com.meowu.commons.utils.ReflectionUtils;
import com.meowu.mybatis.plugin.mysql.core.expression.*;

import java.util.function.Function;

public class Restrictions{

    public static Equal equal(Function function){
        Equal equal = new Equal();
        equal.setField(ReflectionUtils.getFieldName(function));
        return equal;
    }

    public static LessThan lessThan(Function function){
        LessThan lessThan = new LessThan();
        lessThan.setField(ReflectionUtils.getFieldName(function));
        return lessThan;
    }

    public static LessThanAndEqual lessThanAndEqual(Function function){
        LessThanAndEqual lessThanAndEqual = new LessThanAndEqual();
        lessThanAndEqual.setField(ReflectionUtils.getFieldName(function));
        return lessThanAndEqual;
    }

    public static GreaterThan greaterThan(Function function){
        GreaterThan greaterThan = new GreaterThan();
        greaterThan.setField(ReflectionUtils.getFieldName(function));
        return greaterThan;
    }

    public static GreaterThanAndEqual greaterThanAndEqual(Function function){
        GreaterThanAndEqual greaterThanAndEqual = new GreaterThanAndEqual();
        greaterThanAndEqual.setField(ReflectionUtils.getFieldName(function));
        return greaterThanAndEqual;
    }

    public static IsNull isNull(Function function){
        IsNull isNull = new IsNull();
        isNull.setField(ReflectionUtils.getFieldName(function));
        return isNull;
    }

    public static Between between(Function function){
        Between between = new Between();
        between.setField(ReflectionUtils.getFieldName(function));
        return between;
    }

    public static In in(Function function){
        In in = new In();
        in.setField(ReflectionUtils.getFieldName(function));
        return in;
    }

    public static Count count(){
        Count count = new Count();
        count.setField("*");
        return count;
    }

    public static Count count(Function function){
        Count count = new Count();
        count.setField(ReflectionUtils.getFieldName(function));
        return count;
    }

    public static And and(){
        And and = new And();
        return and;
    }

    public static Or or(){
        Or or = new Or();
        return or;
    }
}
