package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教练管理对象 sys_trainer
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public class SysTrainer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 教练 */
    @Excel(name = "教练")
    private String trainer;

    /** 评分 */
    @Excel(name = "评分")
    private String grade;

    /** 评价 */
    @Excel(name = "评价")
    private String comment;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 权重 */
    @Excel(name = "权重")
    private Long weight;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTrainer(String trainer) 
    {
        this.trainer = trainer;
    }

    public String getTrainer() 
    {
        return trainer;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("trainer", getTrainer())
            .append("grade", getGrade())
            .append("comment", getComment())
            .append("status", getStatus())
            .append("weight", getWeight())
            .toString();
    }
}
