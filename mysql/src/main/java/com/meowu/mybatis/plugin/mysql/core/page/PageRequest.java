package com.meowu.mybatis.plugin.mysql.core.page;

public class PageRequest extends com.meowu.mybatis.plugin.commons.core.page.PageRequest{

    public PageRequest(int pageNumber, int pageSize){
        super(pageNumber, pageSize);
    }

    @Override
    public int getOffset(){
        int pageNumber = getPageNumber();
        int pageSize   = getPageSize();

        return (pageNumber - 1) * pageSize;
    }
}
