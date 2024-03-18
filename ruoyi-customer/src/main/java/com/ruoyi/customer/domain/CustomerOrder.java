package com.ruoyi.customer.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单管理对象 sys_order
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
public class CustomerOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNo;

    /** 会员id */
    @Excel(name = "会员id")
    private Long userId;

    /** 预约配置ID */
    @Excel(name = "预约配置ID")
    private Long courseId;

    /** 支付状态 */
    private Integer payState;

    /** 退款状态 */
    @Excel(name = "退款状态")
    private Integer refundState;

    /** 付款金额 */
    @Excel(name = "付款金额")
    private BigDecimal payAmount;

    /** 退款金额 */
    @Excel(name = "退款金额")
    private BigDecimal refundAmount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setPayState(Integer payState) 
    {
        this.payState = payState;
    }

    public Integer getPayState() 
    {
        return payState;
    }
    public void setRefundState(Integer refundState) 
    {
        this.refundState = refundState;
    }

    public Integer getRefundState() 
    {
        return refundState;
    }
    public void setPayAmount(BigDecimal payAmount) 
    {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayAmount() 
    {
        return payAmount;
    }
    public void setRefundAmount(BigDecimal refundAmount) 
    {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getRefundAmount() 
    {
        return refundAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("userId", getUserId())
            .append("courseId", getCourseId())
            .append("payState", getPayState())
            .append("refundState", getRefundState())
            .append("payAmount", getPayAmount())
            .append("refundAmount", getRefundAmount())
            .append("createTime", getCreateTime())
            .toString();
    }
}
