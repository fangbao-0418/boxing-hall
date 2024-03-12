package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysIntegralGoods;

/**
 * 商品积分Service接口
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public interface ISysIntegralGoodsService 
{
    /**
     * 查询商品积分
     * 
     * @param id 商品积分主键
     * @return 商品积分
     */
    public SysIntegralGoods selectSysIntegralGoodsById(Long id);

    /**
     * 查询商品积分列表
     * 
     * @param sysIntegralGoods 商品积分
     * @return 商品积分集合
     */
    public List<SysIntegralGoods> selectSysIntegralGoodsList(SysIntegralGoods sysIntegralGoods);

    /**
     * 新增商品积分
     * 
     * @param sysIntegralGoods 商品积分
     * @return 结果
     */
    public int insertSysIntegralGoods(SysIntegralGoods sysIntegralGoods);

    /**
     * 修改商品积分
     * 
     * @param sysIntegralGoods 商品积分
     * @return 结果
     */
    public int updateSysIntegralGoods(SysIntegralGoods sysIntegralGoods);

    /**
     * 批量删除商品积分
     * 
     * @param ids 需要删除的商品积分主键集合
     * @return 结果
     */
    public int deleteSysIntegralGoodsByIds(Long[] ids);

    /**
     * 删除商品积分信息
     * 
     * @param id 商品积分主键
     * @return 结果
     */
    public int deleteSysIntegralGoodsById(Long id);
}
