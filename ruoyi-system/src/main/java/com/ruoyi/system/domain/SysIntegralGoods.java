package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品积分对象 sys_integral_goods
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public class SysIntegralGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long id;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 商品banner */
    @Excel(name = "商品banner")
    private String banner;

    /** 库存 */
    @Excel(name = "库存")
    private Long stockqty;

    /** 1:上架、2:下架 */
    @Excel(name = "1:上架、2:下架")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setBanner(String banner) 
    {
        this.banner = banner;
    }

    public String getBanner() 
    {
        return banner;
    }
    public void setStockqty(Long stockqty) 
    {
        this.stockqty = stockqty;
    }

    public Long getStockqty() 
    {
        return stockqty;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productName", getProductName())
            .append("banner", getBanner())
            .append("stockqty", getStockqty())
            .append("status", getStatus())
            .toString();
    }
}
