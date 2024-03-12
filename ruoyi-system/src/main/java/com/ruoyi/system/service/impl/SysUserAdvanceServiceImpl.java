package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysUserAdvanceMapper;
import com.ruoyi.system.domain.SysUserAdvance;
import com.ruoyi.system.service.ISysUserAdvanceService;

/**
 * 会员预约Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@Service
public class SysUserAdvanceServiceImpl implements ISysUserAdvanceService 
{
    @Autowired
    private SysUserAdvanceMapper sysUserAdvanceMapper;

    /**
     * 查询会员预约
     * 
     * @param id 会员预约主键
     * @return 会员预约
     */
    @Override
    public SysUserAdvance selectSysUserAdvanceById(Long id)
    {
        return sysUserAdvanceMapper.selectSysUserAdvanceById(id);
    }

    /**
     * 查询会员预约列表
     * 
     * @param sysUserAdvance 会员预约
     * @return 会员预约
     */
    @Override
    public List<SysUserAdvance> selectSysUserAdvanceList(SysUserAdvance sysUserAdvance)
    {
        return sysUserAdvanceMapper.selectSysUserAdvanceList(sysUserAdvance);
    }

    /**
     * 新增会员预约
     * 
     * @param sysUserAdvance 会员预约
     * @return 结果
     */
    @Override
    public int insertSysUserAdvance(SysUserAdvance sysUserAdvance)
    {
        return sysUserAdvanceMapper.insertSysUserAdvance(sysUserAdvance);
    }

    /**
     * 修改会员预约
     * 
     * @param sysUserAdvance 会员预约
     * @return 结果
     */
    @Override
    public int updateSysUserAdvance(SysUserAdvance sysUserAdvance)
    {
        return sysUserAdvanceMapper.updateSysUserAdvance(sysUserAdvance);
    }

    /**
     * 批量删除会员预约
     * 
     * @param ids 需要删除的会员预约主键
     * @return 结果
     */
    @Override
    public int deleteSysUserAdvanceByIds(Long[] ids)
    {
        return sysUserAdvanceMapper.deleteSysUserAdvanceByIds(ids);
    }

    /**
     * 删除会员预约信息
     * 
     * @param id 会员预约主键
     * @return 结果
     */
    @Override
    public int deleteSysUserAdvanceById(Long id)
    {
        return sysUserAdvanceMapper.deleteSysUserAdvanceById(id);
    }
}
