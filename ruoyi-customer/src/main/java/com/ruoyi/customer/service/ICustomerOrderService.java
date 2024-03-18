package com.ruoyi.customer.service;

import java.util.List;
import com.ruoyi.customer.domain.CustomerOrder;

/**
 * 订单管理Service接口
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
public interface ICustomerOrderService 
{
    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    public CustomerOrder selectSysOrderById(Long id);

    /**
     * 查询订单管理列表
     * 
     * @param sysOrder 订单管理
     * @return 订单管理集合
     */
    public List<CustomerOrder> selectSysOrderList(CustomerOrder sysOrder);

    /**
     * 新增订单管理
     * 
     * @param sysOrder 订单管理
     * @return 结果
     */
    public int insertSysOrder(CustomerOrder sysOrder);

    /**
     * 修改订单管理
     * 
     * @param sysOrder 订单管理
     * @return 结果
     */
    public int updateSysOrder(CustomerOrder sysOrder);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理主键集合
     * @return 结果
     */
    public int deleteSysOrderByIds(Long[] ids);

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    public int deleteSysOrderById(Long id);
}
