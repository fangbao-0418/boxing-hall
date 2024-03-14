package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预约管理对象 sys_advance_config
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
public class SysAdvanceConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 权重 */
    @Excel(name = "权重")
    private String weight;

    /** 最大可预约人数 */
    @Excel(name = "最大可预约人数")
    private String maxUsersNum;

    /** 类型 */
    @Excel(name = "类型")
    private Integer type;

    /** 课时 */
    @Excel(name = "课时")
    private String times;

    /** 售价 */
    @Excel(name = "售价")
    private BigDecimal price;

    /** 时段 */
    @Excel(name = "时段")
    private String periods;

    /** 预约须知 */
    @Excel(name = "预约须知")
    private String instruction;

    /** 教练ID */
    @Excel(name = "教练ID")
    private Long trainerId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setMaxUsersNum(String maxUsersNum) 
    {
        this.maxUsersNum = maxUsersNum;
    }

    public String getMaxUsersNum() 
    {
        return maxUsersNum;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setTimes(String times) 
    {
        this.times = times;
    }

    public String getTimes() 
    {
        return times;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setPeriods(String periods) 
    {
        this.periods = periods;
    }

    public String getPeriods() 
    {
        return periods;
    }
    public void setInstruction(String instruction) 
    {
        this.instruction = instruction;
    }

    public String getInstruction() 
    {
        return instruction;
    }
    public void setTrainerId(Long trainerId) 
    {
        this.trainerId = trainerId;
    }

    public Long getTrainerId() 
    {
        return trainerId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("weight", getWeight())
            .append("maxUsersNum", getMaxUsersNum())
            .append("type", getType())
            .append("times", getTimes())
            .append("price", getPrice())
            .append("periods", getPeriods())
            .append("instruction", getInstruction())
            .append("trainerId", getTrainerId())
            .toString();
    }
}
