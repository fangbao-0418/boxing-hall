package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAdvanceConfigMapper;
import com.ruoyi.system.domain.SysAdvanceConfig;
import com.ruoyi.system.service.ISysAdvanceConfigService;

/**
 * 预约配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-11
 */
@Service
public class SysAdvanceConfigServiceImpl implements ISysAdvanceConfigService 
{
    @Autowired
    private SysAdvanceConfigMapper sysAdvanceConfigMapper;

    /**
     * 查询预约配置
     * 
     * @param id 预约配置主键
     * @return 预约配置
     */
    @Override
    public SysAdvanceConfig selectSysAdvanceConfigById(Long id)
    {
        return sysAdvanceConfigMapper.selectSysAdvanceConfigById(id);
    }

    /**
     * 查询预约配置列表
     * 
     * @param sysAdvanceConfig 预约配置
     * @return 预约配置
     */
    @Override
    public List<SysAdvanceConfig> selectSysAdvanceConfigList(SysAdvanceConfig sysAdvanceConfig)
    {
        return sysAdvanceConfigMapper.selectSysAdvanceConfigList(sysAdvanceConfig);
    }

    /**
     * 新增预约配置
     * 
     * @param sysAdvanceConfig 预约配置
     * @return 结果
     */
    @Override
    public int insertSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig)
    {
        return sysAdvanceConfigMapper.insertSysAdvanceConfig(sysAdvanceConfig);
    }

    /**
     * 修改预约配置
     * 
     * @param sysAdvanceConfig 预约配置
     * @return 结果
     */
    @Override
    public int updateSysAdvanceConfig(SysAdvanceConfig sysAdvanceConfig)
    {
        return sysAdvanceConfigMapper.updateSysAdvanceConfig(sysAdvanceConfig);
    }

    /**
     * 批量删除预约配置
     * 
     * @param ids 需要删除的预约配置主键
     * @return 结果
     */
    @Override
    public int deleteSysAdvanceConfigByIds(Long[] ids)
    {
        return sysAdvanceConfigMapper.deleteSysAdvanceConfigByIds(ids);
    }

    /**
     * 删除预约配置信息
     * 
     * @param id 预约配置主键
     * @return 结果
     */
    @Override
    public int deleteSysAdvanceConfigById(Long id)
    {
        return sysAdvanceConfigMapper.deleteSysAdvanceConfigById(id);
    }
}
