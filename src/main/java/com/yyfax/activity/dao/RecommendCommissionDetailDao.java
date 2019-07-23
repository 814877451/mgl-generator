package com.yyfax.activity.dao;

import com.yyfax.activity.domain.RecommendCommissionDetailDO;

public interface RecommendCommissionDetailDao {
    int deleteByPrimaryKey(Long id);

    int insert(RecommendCommissionDetailDO record);

    int insertSelective(RecommendCommissionDetailDO record);

    RecommendCommissionDetailDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecommendCommissionDetailDO record);

    int updateByPrimaryKey(RecommendCommissionDetailDO record);
}