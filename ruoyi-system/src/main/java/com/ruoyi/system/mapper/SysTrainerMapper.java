package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysTrainer;

/**
 * 教练管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public interface SysTrainerMapper 
{
    /**
     * 查询教练管理
     * 
     * @param id 教练管理主键
     * @return 教练管理
     */
    public SysTrainer selectSysTrainerById(Long id);

    /**
     * 查询教练管理列表
     * 
     * @param sysTrainer 教练管理
     * @return 教练管理集合
     */
    public List<SysTrainer> selectSysTrainerList(SysTrainer sysTrainer);

    /**
     * 新增教练管理
     * 
     * @param sysTrainer 教练管理
     * @return 结果
     */
    public int insertSysTrainer(SysTrainer sysTrainer);

    /**
     * 修改教练管理
     * 
     * @param sysTrainer 教练管理
     * @return 结果
     */
    public int updateSysTrainer(SysTrainer sysTrainer);

    /**
     * 删除教练管理
     * 
     * @param id 教练管理主键
     * @return 结果
     */
    public int deleteSysTrainerById(Long id);

    /**
     * 批量删除教练管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysTrainerByIds(Long[] ids);
}
