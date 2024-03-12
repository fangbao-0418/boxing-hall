package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysKnowledge;

/**
 * 拳馆常识Service接口
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public interface ISysKnowledgeService 
{
    /**
     * 查询拳馆常识
     * 
     * @param id 拳馆常识主键
     * @return 拳馆常识
     */
    public SysKnowledge selectSysKnowledgeById(Long id);

    /**
     * 查询拳馆常识列表
     * 
     * @param sysKnowledge 拳馆常识
     * @return 拳馆常识集合
     */
    public List<SysKnowledge> selectSysKnowledgeList(SysKnowledge sysKnowledge);

    /**
     * 新增拳馆常识
     * 
     * @param sysKnowledge 拳馆常识
     * @return 结果
     */
    public int insertSysKnowledge(SysKnowledge sysKnowledge);

    /**
     * 修改拳馆常识
     * 
     * @param sysKnowledge 拳馆常识
     * @return 结果
     */
    public int updateSysKnowledge(SysKnowledge sysKnowledge);

    /**
     * 批量删除拳馆常识
     * 
     * @param ids 需要删除的拳馆常识主键集合
     * @return 结果
     */
    public int deleteSysKnowledgeByIds(Long[] ids);

    /**
     * 删除拳馆常识信息
     * 
     * @param id 拳馆常识主键
     * @return 结果
     */
    public int deleteSysKnowledgeById(Long id);
}
