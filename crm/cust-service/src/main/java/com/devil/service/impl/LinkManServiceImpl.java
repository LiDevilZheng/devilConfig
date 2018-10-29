package com.devil.service.impl;

import com.devil.entity.LinkMan;
import com.devil.mapper.LinkManMapper;
import com.devil.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LinkManServiceImpl implements LinkManService {
    @Autowired
    private LinkManMapper linkManMapper;

    public LinkManMapper getLinkManMapper() {
        return linkManMapper;
    }

    public void setLinkManMapper(LinkManMapper linkManMapper) {
        this.linkManMapper = linkManMapper;
    }

    @Override
    public List<LinkMan> getLinkMan(String cust_no) {
        return linkManMapper.getLinkMan(cust_no);
    }

    @Override
    public int addLinkMan(LinkMan linkMan) {
        return linkManMapper.addLinkMan(linkMan);
    }

    @Override
    public int updateLinkMan(LinkMan linkMan) {
        return linkManMapper.updateLinkMan(linkMan);
    }

    @Override
    public LinkMan findById(int id) {
        return linkManMapper.findById(id);
    }

    @Override
    public int delLinkMan(int id) {
        return 0;
    }
}
