package com.devil.service;

import com.devil.entity.LinkMan;

import java.util.List;

public interface LinkManService {
    public List<LinkMan> getLinkMan(String cust_no);

    public int addLinkMan(LinkMan linkMan);

    public int updateLinkMan(LinkMan linkMan);

    public LinkMan findById(int id);

    public int delLinkMan(int id);
}
