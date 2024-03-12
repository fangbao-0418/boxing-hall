package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysAdvanceConfig;

/**
 * 预约配置Service接口
 * 
 * @author ruoyi
 * @date 2024-03-11
 */
public interface ISysAdvanceConfigService 
{
    /**
     * 查询预约配置
     * 
     * @param id 预约配置主键
     * @return 预约配置
     */
    public SysAdvanceConfig selectSysAdvanceConfigById(Long id);

    /**
     * 查询预约配置列表
     * 
     * @param sysAdvanceConfig 预约配置
     * @return 预约配置集合
     */
    public List<SysAdvanceConfig> selectSysAdvanceConfigList(SysAdvanceConfig sysAdvanceConfig);

    /**
     * 新增预约配置
     * 
     * @param sysAdvanceConfig 预约配置
     * @return 结果
     */
    public int insertSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig);

    /**
     * 修改预约配置
     * 
     * @param sysAdvanceConfig 预约配置
     * @return 结果
     */
    public int updateSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig);

    /**
     * 批量删除预约配置
     * 
     * @param ids 需要删除的预约配置主键集合
     * @return 结果
     */
    public int deleteSysAdvanceConfigByIds(Long[] ids);

    /**
     * 删除预约配置信息
     * 
     * @param id 预约配置主键
     * @return 结果
     */
    public int deleteSysAdvanceConfigById(Long id);
}
