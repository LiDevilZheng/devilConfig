package com.devil.service;

import com.devil.entity.Activity;

import java.util.List;

public interface ActivityService {
    public List<Activity> getActivityById(int id);

    public int addActivity(Activity activity);

    public Activity findByActivityId(int id);

    public int updateActivity(Activity activity);

    public int delActivity(int id);
}
