package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预约配置对象 sys_advance_config
 * 
 * @author ruoyi
 * @date 2024-03-11
 */
public class SysAdvanceConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 预约标题 教练/课程 */
    @Excel(name = "预约标题 教练/课程")
    private String title;

    /** 权重 */
    @Excel(name = "权重")
    private Long weight;

    /** 最大可预约人数 */
    @Excel(name = "最大可预约人数")
    private String maxUsersNum;

    /** 1-教练 2-课程 */
    @Excel(name = "1-教练 2-课程")
    private String type;

    /** 课时 */
    @Excel(name = "课时")
    private String times;

    /** 售价 */
    @Excel(name = "售价")
    private BigDecimal price;

    /** 预约须知 */
    @Excel(name = "预约须知")
    private String instruction;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private Long gmtCreate;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private Long gmtModify;

    /** 语言标识符 */
    @Excel(name = "语言标识符")
    private String lang;

    /** 语言描述 */
    @Excel(name = "语言描述")
    private String description;

    /** 状态 0-禁用 1-启用 */
    @Excel(name = "状态 0-禁用 1-启用")
    private Long status;

    /** 默认语言 0-非默认 1-默认 */
    @Excel(name = "默认语言 0-非默认 1-默认")
    private Integer isDefault;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String google;

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
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
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
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
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
    public void setInstruction(String instruction) 
    {
        this.instruction = instruction;
    }

    public String getInstruction() 
    {
        return instruction;
    }
    public void setGmtCreate(Long gmtCreate) 
    {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtCreate() 
    {
        return gmtCreate;
    }
    public void setGmtModify(Long gmtModify) 
    {
        this.gmtModify = gmtModify;
    }

    public Long getGmtModify() 
    {
        return gmtModify;
    }
    public void setLang(String lang) 
    {
        this.lang = lang;
    }

    public String getLang() 
    {
        return lang;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setIsDefault(Integer isDefault) 
    {
        this.isDefault = isDefault;
    }

    public Integer getIsDefault() 
    {
        return isDefault;
    }
    public void setGoogle(String google) 
    {
        this.google = google;
    }

    public String getGoogle() 
    {
        return google;
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
            .append("instruction", getInstruction())
            .append("gmtCreate", getGmtCreate())
            .append("gmtModify", getGmtModify())
            .append("lang", getLang())
            .append("description", getDescription())
            .append("status", getStatus())
            .append("isDefault", getIsDefault())
            .append("google", getGoogle())
            .toString();
    }
}
