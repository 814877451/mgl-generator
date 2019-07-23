package com.yyfax.activity.dao;

import com.yyfax.activity.domain.RecommendCommissionRuleDO;

public interface RecommendCommissionRuleDao {
    int deleteByPrimaryKey(Long id);

    int insert(RecommendCommissionRuleDO record);

    int insertSelective(RecommendCommissionRuleDO record);

    RecommendCommissionRuleDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecommendCommissionRuleDO record);

    int updateByPrimaryKey(RecommendCommissionRuleDO record);
}