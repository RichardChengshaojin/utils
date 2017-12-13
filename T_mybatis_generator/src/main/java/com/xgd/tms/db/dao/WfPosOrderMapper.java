package com.xgd.tms.db.dao;

import com.xgd.tms.db.entity.WfPosOrder;

public interface WfPosOrderMapper {
    int insert(WfPosOrder record);

    int insertSelective(WfPosOrder record);
}