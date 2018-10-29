package com.devil.dto;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable {
    private Integer pageNo=1;
    private Integer pageSize=5;
    private Integer from;
    private Integer offset;
    private Integer count;
    private Integer pageCount;
    private List<T> list;

    public Integer getPageNo() {
        if(pageNo<1){
            pageNo=1;
        }
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if(pageNo>0)
            this.pageNo=pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if(pageSize>0)
            this.pageSize = pageSize;
    }

    public Integer getFrom() {
        from=(pageNo-1)*pageSize;
        return from;
    }

    public void setFrom(Integer from) {
        if(from>0)
            this.from = from;
    }

    public Integer getOffset() {
        offset=pageSize;
        return offset;
    }

    public void setOffset(Integer offset) {
        if(offset>0)
            this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    public PageBean(){

    }
    public PageBean(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.from = from;
        this.offset = offset;
        this.count = count;
        this.pageCount = pageCount;
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", from=" + from +
                ", offset=" + offset +
                ", count=" + count +
                ", pageCount=" + pageCount +
                ", list=" + list +
                '}';
    }
}
