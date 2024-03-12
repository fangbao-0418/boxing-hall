package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysUserAdvance;

/**
 * 会员预约Service接口
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
public interface ISysUserAdvanceService 
{
    /**
     * 查询会员预约
     * 
     * @param id 会员预约主键
     * @return 会员预约
     */
    public SysUserAdvance selectSysUserAdvanceById(Long id);

    /**
     * 查询会员预约列表
     * 
     * @param sysUserAdvance 会员预约
     * @return 会员预约集合
     */
    public List<SysUserAdvance> selectSysUserAdvanceList(SysUserAdvance sysUserAdvance);

    /**
     * 新增会员预约
     * 
     * @param sysUserAdvance 会员预约
     * @return 结果
     */
    public int insertSysUserAdvance(SysUserAdvance sysUserAdvance);

    /**
     * 修改会员预约
     * 
     * @param sysUserAdvance 会员预约
     * @return 结果
     */
    public int updateSysUserAdvance(SysUserAdvance sysUserAdvance);

    /**
     * 批量删除会员预约
     * 
     * @param ids 需要删除的会员预约主键集合
     * @return 结果
     */
    public int deleteSysUserAdvanceByIds(Long[] ids);

    /**
     * 删除会员预约信息
     * 
     * @param id 会员预约主键
     * @return 结果
     */
    public int deleteSysUserAdvanceById(Long id);
}
