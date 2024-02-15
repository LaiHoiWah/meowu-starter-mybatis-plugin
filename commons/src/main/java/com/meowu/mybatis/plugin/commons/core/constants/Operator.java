package com.meowu.mybatis.plugin.commons.core.constants;

public interface Operator{

    // operator
    String EQ          = "=";
    String NEQ         = "<>";
    String LT          = "<";
    String LTE         = "<=";
    String GT          = ">";
    String GTE         = ">=";
    String LIKE        = "LIKE";
    String NOT_LIKE    = "NOT LIKE";
    String IS_NULL     = "IS NULL";
    String NOT_NULL    = "NOT NULL";

    // function
    String IN          = "IN";
    String NOT_IN      = "NOT IN";
    String BETWEEN     = "BETWEEN";
    String NOT_BETWEEN = "NOT BETWEEN";
    String COUNT       = "COUNT";
    String LIMIT       = "LIMIT";
    String AND         = "AND";
    String OR          = "OR";

    // symbol
    String PERCENT_SIGN = "%";
}
