package com.example.dao;

import com.example.model.Achievement;

public interface AchievementMapper {
    int deleteByPrimaryKey(Integer achId);

    int insert(Achievement record);

    int insertSelective(Achievement record);

    Achievement selectByPrimaryKey(Integer achId);

    int updateByPrimaryKeySelective(Achievement record);

    int updateByPrimaryKey(Achievement record);
}