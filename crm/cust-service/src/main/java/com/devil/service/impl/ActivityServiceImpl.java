package com.devil.service.impl;

import com.devil.entity.Activity;
import com.devil.mapper.ActivityMapper;
import com.devil.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;
    @Override
    public List<Activity> getActivityById(int id) {
        return activityMapper.getActivityById(id);
    }

    @Override
    public int addActivity(Activity activity) {
        return activityMapper.addActivity(activity);
    }

    @Override
    public Activity findByActivityId(int id) {
        return activityMapper.findByActivityId(id);
    }

    @Override
    public int updateActivity(Activity activity) {
        return activityMapper.updateActivity(activity);
    }

    @Override
    public int delActivity(int id) {
        return activityMapper.delActivity(id);
    }
}
