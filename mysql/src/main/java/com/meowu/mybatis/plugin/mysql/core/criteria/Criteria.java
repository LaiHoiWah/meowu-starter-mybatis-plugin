package com.meowu.mybatis.plugin.mysql.core.criteria;

import com.meowu.commons.utils.CollectionUtils;
import com.meowu.mybatis.plugin.commons.core.expression.Expression;
import com.meowu.mybatis.plugin.commons.core.expression.Selection;
import com.meowu.mybatis.plugin.mysql.core.expression.Limit;
import com.meowu.mybatis.plugin.mysql.core.page.PageRequest;
import lombok.Getter;

import java.util.List;
import java.util.function.Function;

@Getter
public class Criteria{

    private Selection selection;
    private List<Expression> expressions;
    private Limit limit;

    public Criteria(){
        this.selection  = new Selection();
        this.expressions = CollectionUtils.emptyList();
    }

    public void select(Function... functions){
        for(Function function : functions){
            if(function != null){
                this.selection.select(function);
            }
        }
    }

    public void select(Expression... expressions){
        for(Expression expression : expressions){
            if(expression != null){
                this.selection.select(expression);
            }
        }
    }

    public void reSelect(){
        this.selection = new Selection();
    }

    public void where(Expression... expressions){
        for(Expression expression : expressions){
            if(expression != null){
                this.expressions.add(expression);
            }
        }
    }

    public void reCondition(){
        this.expressions = CollectionUtils.emptyList();
    }

    public void limit(PageRequest pageRequest){
        this.limit = new Limit();
        this.limit.value(pageRequest.getOffset(), pageRequest.getPageSize());
    }

    public void reLimit(){
        this.limit = null;
    }
}
