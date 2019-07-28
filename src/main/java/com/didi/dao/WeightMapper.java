package com.didi.dao;

import com.didi.domain.WeightEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @author: koco
* @time: 2019-07-28 20:36
* @table: weight
* @description: 
*/
public interface WeightMapper {

    /**
     * @param  entity  table entity
     * @return List<WeightEntity>
     */
    List<WeightEntity> getByCondition(WeightEntity entity);

    /**
     * @param  wId  
     * @return WeightEntity
     */
    WeightEntity getByWId(@Param("wId") Integer wId);

    /**
     * @param  wUserid  
     * @return List<WeightEntity>
     */
    List<WeightEntity> getByWUserid(@Param("wUserid") Integer wUserid);

    /**
     * @param  entity  table entity
     * @return int
     */
    int insert(WeightEntity entity);

    /**
     * @param entity  table entity
     * @return int
     */
    int updateById(WeightEntity entity);

}