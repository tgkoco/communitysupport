package com.didi.dao;

import com.didi.domain.QuestionEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @author: koco
* @time: 2019-07-28 20:36
* @table: question
* @description: 
*/
public interface QuestionMapper {

    /**
     * @param  entity  table entity
     * @return List<QuestionEntity>
     */
    List<QuestionEntity> getByCondition(QuestionEntity entity);

    /**
     * @param  qId  
     * @return QuestionEntity
     */
    QuestionEntity getByQId(@Param("qId") Integer qId);

    /**
     * @param  qUserid  
     * @return List<QuestionEntity>
     */
    List<QuestionEntity> getByQUserid(@Param("qUserid") Integer qUserid);

    /**
     * @param  entity  table entity
     * @return int
     */
    int insert(QuestionEntity entity);

    /**
     * @param entity  table entity
     * @return int
     */
    int updateById(QuestionEntity entity);

}