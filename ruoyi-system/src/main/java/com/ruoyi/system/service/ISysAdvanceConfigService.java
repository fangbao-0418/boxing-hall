package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysAdvanceConfig;

/**
 * 预约管理Service接口
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
public interface ISysAdvanceConfigService 
{
    /**
     * 查询预约管理
     * 
     * @param id 预约管理主键
     * @return 预约管理
     */
    public SysAdvanceConfig selectSysAdvanceConfigById(Long id);

    /**
     * 查询预约管理列表
     * 
     * @param sysAdvanceConfig 预约管理
     * @return 预约管理集合
     */
    public List<SysAdvanceConfig> selectSysAdvanceConfigList(SysAdvanceConfig sysAdvanceConfig);

    /**
     * 新增预约管理
     * 
     * @param sysAdvanceConfig 预约管理
     * @return 结果
     */
    public int insertSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig);

    /**
     * 修改预约管理
     * 
     * @param sysAdvanceConfig 预约管理
     * @return 结果
     */
    public int updateSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig);

    /**
     * 批量删除预约管理
     * 
     * @param ids 需要删除的预约管理主键集合
     * @return 结果
     */
    public int deleteSysAdvanceConfigByIds(Long[] ids);

    /**
     * 删除预约管理信息
     * 
     * @param id 预约管理主键
     * @return 结果
     */
    public int deleteSysAdvanceConfigById(Long id);
}
