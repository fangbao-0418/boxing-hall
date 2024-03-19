package com.ruoyi.customer.service.impl;

import java.util.Date;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.customer.mapper.CustomerKnowledgeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.customer.domain.CustomerKnowledge;
import com.ruoyi.customer.service.ICustomerKnowledgeService;

/**
 * 拳馆常识Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@Service
public class CustomerKnowledgeServiceImpl implements ICustomerKnowledgeService 
{
    @Autowired
    private CustomerKnowledgeMapper sysKnowledgeMapper;

    /**
     * 查询拳馆常识
     * 
     * @param id 拳馆常识主键
     * @return 拳馆常识
     */
    @Override
    public CustomerKnowledge selectSysKnowledgeById(Long id)
    {
        return sysKnowledgeMapper.selectSysKnowledgeById(id);
    }

    /**
     * 查询拳馆常识列表
     * 
     * @param sysKnowledge 拳馆常识
     * @return 拳馆常识
     */
    @Override
    public List<CustomerKnowledge> selectSysKnowledgeList(CustomerKnowledge sysKnowledge)
    {
        return sysKnowledgeMapper.selectSysKnowledgeList(sysKnowledge);
    }

    /**
     * 新增拳馆常识
     * 
     * @param sysKnowledge 拳馆常识
     * @return 结果
     */
    @Override
    public int insertSysKnowledge(CustomerKnowledge sysKnowledge)
    {
        sysKnowledge.setUpdateTime(DateUtils.getNowDate());
        return sysKnowledgeMapper.insertSysKnowledge(sysKnowledge);
    }

    /**
     * 修改拳馆常识
     * 
     * @param sysKnowledge 拳馆常识
     * @return 结果
     */
    @Override
    public int updateSysKnowledge(CustomerKnowledge sysKnowledge)
    {
        sysKnowledge.setUpdateTime(DateUtils.getNowDate());
        return sysKnowledgeMapper.updateSysKnowledge(sysKnowledge);
    }

    /**
     * 批量删除拳馆常识
     * 
     * @param ids 需要删除的拳馆常识主键
     * @return 结果
     */
    @Override
    public int deleteSysKnowledgeByIds(Long[] ids)
    {
        return sysKnowledgeMapper.deleteSysKnowledgeByIds(ids);
    }

    /**
     * 删除拳馆常识信息
     * 
     * @param id 拳馆常识主键
     * @return 结果
     */
    @Override
    public int deleteSysKnowledgeById(Long id)
    {
        return sysKnowledgeMapper.deleteSysKnowledgeById(id);
    }
}
