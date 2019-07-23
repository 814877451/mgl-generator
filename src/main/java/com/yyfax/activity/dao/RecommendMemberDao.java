package com.yyfax.activity.dao;

import com.yyfax.activity.domain.RecommendMemberDO;

public interface RecommendMemberDao {
    int deleteByPrimaryKey(Long id);

    int insert(RecommendMemberDO record);

    int insertSelective(RecommendMemberDO record);

    RecommendMemberDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecommendMemberDO record);

    int updateByPrimaryKey(RecommendMemberDO record);
}