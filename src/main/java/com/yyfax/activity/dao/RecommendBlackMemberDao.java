package com.yyfax.activity.dao;

import com.yyfax.activity.domain.RecommendBlackMemberDO;

public interface RecommendBlackMemberDao {
    int deleteByPrimaryKey(Long id);

    int insert(RecommendBlackMemberDO record);

    int insertSelective(RecommendBlackMemberDO record);

    RecommendBlackMemberDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecommendBlackMemberDO record);

    int updateByPrimaryKey(RecommendBlackMemberDO record);
}