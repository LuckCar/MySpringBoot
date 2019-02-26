package com.example.dao;

import com.example.model.Curriculum;

public interface CurriculumMapper {
    int deleteByPrimaryKey(Integer curId);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(Integer curId);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}