package com.yyfax.activity.dao;

import com.yyfax.activity.domain.RecommendInfoDO;

public interface RecommendInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(RecommendInfoDO record);

    int insertSelective(RecommendInfoDO record);

    RecommendInfoDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecommendInfoDO record);

    int updateByPrimaryKey(RecommendInfoDO record);
}