package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会员预约对象 sys_user_advance
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public class SysUserAdvance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 预约id */
    private Long id;

    /** 会员姓名 */
    @Excel(name = "会员姓名")
    private String userName;

    /** 手机号码/联系电话 */
    @Excel(name = "手机号码/联系电话")
    private String mobile;

    /** 预约状态 */
    @Excel(name = "预约状态")
    private Integer advanceState;

    /** 预约时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预约时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date advanceTime;

    /** 课程/教练 */
    @Excel(name = "课程/教练")
    private Long productId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setAdvanceState(Integer advanceState) 
    {
        this.advanceState = advanceState;
    }

    public Integer getAdvanceState() 
    {
        return advanceState;
    }
    public void setAdvanceTime(Date advanceTime) 
    {
        this.advanceTime = advanceTime;
    }

    public Date getAdvanceTime() 
    {
        return advanceTime;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userName", getUserName())
            .append("mobile", getMobile())
            .append("advanceState", getAdvanceState())
            .append("advanceTime", getAdvanceTime())
            .append("productId", getProductId())
            .toString();
    }
}
