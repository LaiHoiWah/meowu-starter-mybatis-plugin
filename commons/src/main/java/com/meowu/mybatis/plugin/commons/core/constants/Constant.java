package com.meowu.mybatis.plugin.commons.core.constants;

public interface Constant{

    String EXPRESSION_TYPE_FUNCTION = "function";
    String EXPRESSION_TYPE_OPERATOR = "operator";

    String VALUE_TYPE_NONE       = "none";
    String VALUE_TYPE_SINGLE     = "single";
    String VALUE_TYPE_MULTI      = "multi";
    String VALUE_TYPE_EXPRESSION = "expression";

    String OPERATOR_EQUAL       = "=";
    String OPERATOR_NOT_EQUAL   = "<>";
    String OPERATOR_LESS_THAN   = "<";
    String OPERATOR_LESS_EQUAL  = "<=";
    String OPERATOR_LIKE        = "LIKE";
    String OPERATOR_NOT_LIKE    = "NOT LIKE";
    String OPERATOR_BETWEEN     = "BETWEEN";
    String OPERATOR_NOT_BETWEEN = "NOT BETWEEN";
    String OPERATOR_IN          = "IN";
    String OPERATOR_NOT_IN      = "NOT IN";
    String OPERATOR_IS_NULL     = "IS NULL";
    String OPERATOR_IS_NOT_NULL = "IS NOT NULL";
}
