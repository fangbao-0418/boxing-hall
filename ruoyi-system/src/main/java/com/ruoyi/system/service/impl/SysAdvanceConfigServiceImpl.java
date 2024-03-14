package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAdvanceConfigMapper;
import com.ruoyi.system.domain.SysAdvanceConfig;
import com.ruoyi.system.service.ISysAdvanceConfigService;

/**
 * 预约管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
@Service
public class SysAdvanceConfigServiceImpl implements ISysAdvanceConfigService 
{
    @Autowired
    private SysAdvanceConfigMapper sysAdvanceConfigMapper;

    /**
     * 查询预约管理
     * 
     * @param id 预约管理主键
     * @return 预约管理
     */
    @Override
    public SysAdvanceConfig selectSysAdvanceConfigById(Long id)
    {
        return sysAdvanceConfigMapper.selectSysAdvanceConfigById(id);
    }

    /**
     * 查询预约管理列表
     * 
     * @param sysAdvanceConfig 预约管理
     * @return 预约管理
     */
    @Override
    public List<SysAdvanceConfig> selectSysAdvanceConfigList(SysAdvanceConfig sysAdvanceConfig)
    {
        return sysAdvanceConfigMapper.selectSysAdvanceConfigList(sysAdvanceConfig);
    }

    /**
     * 新增预约管理
     * 
     * @param sysAdvanceConfig 预约管理
     * @return 结果
     */
    @Override
    public int insertSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig)
    {
        return sysAdvanceConfigMapper.insertSysAdvanceConfig(sysAdvanceConfig);
    }

    /**
     * 修改预约管理
     * 
     * @param sysAdvanceConfig 预约管理
     * @return 结果
     */
    @Override
    public int updateSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig)
    {
        return sysAdvanceConfigMapper.updateSysAdvanceConfig(sysAdvanceConfig);
    }

    /**
     * 批量删除预约管理
     * 
     * @param ids 需要删除的预约管理主键
     * @return 结果
     */
    @Override
    public int deleteSysAdvanceConfigByIds(Long[] ids)
    {
        return sysAdvanceConfigMapper.deleteSysAdvanceConfigByIds(ids);
    }

    /**
     * 删除预约管理信息
     * 
     * @param id 预约管理主键
     * @return 结果
     */
    @Override
    public int deleteSysAdvanceConfigById(Long id)
    {
        return sysAdvanceConfigMapper.deleteSysAdvanceConfigById(id);
    }
}
