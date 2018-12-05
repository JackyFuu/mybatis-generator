package com.ssm.generator.dao;

import com.ssm.generator.model.ChildrenInfo;

public interface ChildrenInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChildrenInfo record);

    int insertSelective(ChildrenInfo record);

    ChildrenInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChildrenInfo record);

    int updateByPrimaryKey(ChildrenInfo record);
}