package com.yyfax.activity.dao;

import com.yyfax.activity.domain.RecommendRecordDO;

public interface RecommendRecordDao {
    int deleteByPrimaryKey(Long id);

    int insert(RecommendRecordDO record);

    int insertSelective(RecommendRecordDO record);

    RecommendRecordDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecommendRecordDO record);

    int updateByPrimaryKey(RecommendRecordDO record);
}