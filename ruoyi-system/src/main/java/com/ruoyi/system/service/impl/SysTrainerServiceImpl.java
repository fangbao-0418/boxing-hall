package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysTrainerMapper;
import com.ruoyi.system.domain.SysTrainer;
import com.ruoyi.system.service.ISysTrainerService;

/**
 * 教练管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@Service
public class SysTrainerServiceImpl implements ISysTrainerService 
{
    @Autowired
    private SysTrainerMapper sysTrainerMapper;

    /**
     * 查询教练管理
     * 
     * @param id 教练管理主键
     * @return 教练管理
     */
    @Override
    public SysTrainer selectSysTrainerById(Long id)
    {
        return sysTrainerMapper.selectSysTrainerById(id);
    }

    /**
     * 查询教练管理列表
     * 
     * @param sysTrainer 教练管理
     * @return 教练管理
     */
    @Override
    public List<SysTrainer> selectSysTrainerList(SysTrainer sysTrainer)
    {
        return sysTrainerMapper.selectSysTrainerList(sysTrainer);
    }

    /**
     * 新增教练管理
     * 
     * @param sysTrainer 教练管理
     * @return 结果
     */
    @Override
    public int insertSysTrainer(SysTrainer sysTrainer)
    {
        return sysTrainerMapper.insertSysTrainer(sysTrainer);
    }

    /**
     * 修改教练管理
     * 
     * @param sysTrainer 教练管理
     * @return 结果
     */
    @Override
    public int updateSysTrainer(SysTrainer sysTrainer)
    {
        return sysTrainerMapper.updateSysTrainer(sysTrainer);
    }

    /**
     * 批量删除教练管理
     * 
     * @param ids 需要删除的教练管理主键
     * @return 结果
     */
    @Override
    public int deleteSysTrainerByIds(Long[] ids)
    {
        return sysTrainerMapper.deleteSysTrainerByIds(ids);
    }

    /**
     * 删除教练管理信息
     * 
     * @param id 教练管理主键
     * @return 结果
     */
    @Override
    public int deleteSysTrainerById(Long id)
    {
        return sysTrainerMapper.deleteSysTrainerById(id);
    }
}
