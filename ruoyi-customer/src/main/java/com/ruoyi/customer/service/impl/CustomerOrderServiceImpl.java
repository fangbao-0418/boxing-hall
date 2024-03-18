package com.ruoyi.customer.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.customer.mapper.CustomerOrderMapper;
import com.ruoyi.customer.domain.CustomerOrder;
import com.ruoyi.customer.service.ICustomerOrderService;
// import com.ruoyi.system.utils.OrderNumberGenerator;

/**
 * 订单管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
@Service
public class CustomerOrderServiceImpl implements ICustomerOrderService 
{
    @Autowired
    private CustomerOrderMapper sysOrderMapper;

    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    @Override
    public CustomerOrder selectSysOrderById(Long id)
    {
        return sysOrderMapper.selectSysOrderById(id);
    }

    /**
     * 查询订单管理列表
     * 
     * @param sysOrder 订单管理
     * @return 订单管理
     */
    @Override
    public List<CustomerOrder> selectSysOrderList(CustomerOrder sysOrder)
    {
        return sysOrderMapper.selectSysOrderList(sysOrder);
    }

    /**
     * 新增订单管理
     * 
     * @param sysOrder 订单管理
     * @return 结果
     */
    @Override
    public int insertSysOrder(CustomerOrder sysOrder)
    {
        // sysOrder.setOrderNo(OrderNumberGenerator.generateOrderNumber());
        sysOrder.setCreateTime(DateUtils.getNowDate());
        sysOrder.setPayState(1);
        sysOrder.setRefundAmount(BigDecimal.valueOf(0.0));
        return sysOrderMapper.insertSysOrder(sysOrder);
    }

    /**
     * 修改订单管理
     * 
     * @param sysOrder 订单管理
     * @return 结果
     */
    @Override
    public int updateSysOrder(CustomerOrder sysOrder)
    {
        return sysOrderMapper.updateSysOrder(sysOrder);
    }

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理主键
     * @return 结果
     */
    @Override
    public int deleteSysOrderByIds(Long[] ids)
    {
        return sysOrderMapper.deleteSysOrderByIds(ids);
    }

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    @Override
    public int deleteSysOrderById(Long id)
    {
        return sysOrderMapper.deleteSysOrderById(id);
    }
}
