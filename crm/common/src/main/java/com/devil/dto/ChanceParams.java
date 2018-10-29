package com.devil.dto;

import com.devil.entity.Chance;

import java.io.Serializable;
import java.util.List;

public class ChanceParams implements Serializable {
    private String cust_name;
    private String title;
    private String linkman;
    private Integer pageNo=1;
    private Integer pageSize=5;
    private Integer from;
    private Integer offset;
    private Integer count;
    private Integer pageCount;
    private List<Chance> li;

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

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
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
        if(pageCount!=null&&pageNo>=pageCount){
            this.pageNo=pageCount;
        }
        this.pageCount = pageCount;
    }

    public List<Chance> getLi() {
        return li;
    }

    public void setLi(List<Chance> li) {
        this.li = li;
    }

    public ChanceParams(){

    }
    public ChanceParams(String cust_name, String title, String linkman, Integer pageNo, Integer pageSize,
                        Integer from, Integer offset, Integer count, Integer pageCount, List<Chance> li) {
        this.cust_name = cust_name;
        this.title = title;
        this.linkman = linkman;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.from = from;
        this.offset = offset;
        this.count = count;
        this.pageCount = pageCount;
        this.li = li;
    }
}
