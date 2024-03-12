package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysIntegralGoodsMapper;
import com.ruoyi.system.domain.SysIntegralGoods;
import com.ruoyi.system.service.ISysIntegralGoodsService;

/**
 * 商品积分Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@Service
public class SysIntegralGoodsServiceImpl implements ISysIntegralGoodsService 
{
    @Autowired
    private SysIntegralGoodsMapper sysIntegralGoodsMapper;

    /**
     * 查询商品积分
     * 
     * @param id 商品积分主键
     * @return 商品积分
     */
    @Override
    public SysIntegralGoods selectSysIntegralGoodsById(Long id)
    {
        return sysIntegralGoodsMapper.selectSysIntegralGoodsById(id);
    }

    /**
     * 查询商品积分列表
     * 
     * @param sysIntegralGoods 商品积分
     * @return 商品积分
     */
    @Override
    public List<SysIntegralGoods> selectSysIntegralGoodsList(SysIntegralGoods sysIntegralGoods)
    {
        return sysIntegralGoodsMapper.selectSysIntegralGoodsList(sysIntegralGoods);
    }

    /**
     * 新增商品积分
     * 
     * @param sysIntegralGoods 商品积分
     * @return 结果
     */
    @Override
    public int insertSysIntegralGoods(SysIntegralGoods sysIntegralGoods)
    {
        return sysIntegralGoodsMapper.insertSysIntegralGoods(sysIntegralGoods);
    }

    /**
     * 修改商品积分
     * 
     * @param sysIntegralGoods 商品积分
     * @return 结果
     */
    @Override
    public int updateSysIntegralGoods(SysIntegralGoods sysIntegralGoods)
    {
        return sysIntegralGoodsMapper.updateSysIntegralGoods(sysIntegralGoods);
    }

    /**
     * 批量删除商品积分
     * 
     * @param ids 需要删除的商品积分主键
     * @return 结果
     */
    @Override
    public int deleteSysIntegralGoodsByIds(Long[] ids)
    {
        return sysIntegralGoodsMapper.deleteSysIntegralGoodsByIds(ids);
    }

    /**
     * 删除商品积分信息
     * 
     * @param id 商品积分主键
     * @return 结果
     */
    @Override
    public int deleteSysIntegralGoodsById(Long id)
    {
        return sysIntegralGoodsMapper.deleteSysIntegralGoodsById(id);
    }
}
