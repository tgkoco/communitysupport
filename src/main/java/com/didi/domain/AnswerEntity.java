package com.didi.domain;

import java.util.Date;

/**
 * @author: koco
 * @time: 2019-07-28 20:36
 * @table: answer
 * @description: 
 */
public class AnswerEntity {

    /**
     * 
     * max-len: 11
     * not-null: yes 
     * default: ''
     */
    private Integer aId;

    /**
     * 
     * max-len: 255
     * not-null: no 
     * default: ''
     */
    private String aText;

    /**
     * 
     * max-len: 11
     * not-null: yes 
     * default: ''
     */
    private Integer aQuestionid;

    /**
     * 
     * max-len: 11
     * not-null: yes 
     * default: ''
     */
    private Integer aUserid;

    /**
     * 
     * max-len: 0
     * not-null: yes 
     * default: ''
     */
    private Date aDate;

    
    public Integer getAId(){
        return this.aId;
    }

    public void setAId(Integer aId){
        this.aId = aId;
    }
    
    public String getAText(){
        return this.aText;
    }

    public void setAText(String aText){
        this.aText = aText;
    }
    
    public Integer getAQuestionid(){
        return this.aQuestionid;
    }

    public void setAQuestionid(Integer aQuestionid){
        this.aQuestionid = aQuestionid;
    }
    
    public Integer getAUserid(){
        return this.aUserid;
    }

    public void setAUserid(Integer aUserid){
        this.aUserid = aUserid;
    }
    
    public Date getADate(){
        return this.aDate;
    }

    public void setADate(Date aDate){
        this.aDate = aDate;
    }
    
}
