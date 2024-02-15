package com.meowu.mybatis.plugin.commons.core.page;

import com.meowu.commons.utils.AssertionUtils;
import lombok.Getter;

@Getter
public abstract class PageRequest{

    private int pageNumber;
    private int pageSize;

    public PageRequest(int pageNumber, int pageSize){
        AssertionUtils.isTrue(pageNumber > 0, "Page no. must greater than 0");
        AssertionUtils.isTrue(pageSize > 0, "Page size must greater than 0");

        this.pageNumber = pageNumber;
        this.pageSize   = pageSize;
    }

    public abstract int getOffset();
}
