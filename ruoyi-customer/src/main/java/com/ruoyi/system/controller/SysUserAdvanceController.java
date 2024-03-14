package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysUserAdvance;
import com.ruoyi.system.service.ISysUserAdvanceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会员预约Controller
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@RestController
@RequestMapping("/system/userAdvance")
public class SysUserAdvanceController extends BaseController
{
    @Autowired
    private ISysUserAdvanceService sysUserAdvanceService;

    /**
     * 查询会员预约列表
     */
    @PreAuthorize("@ss.hasPermi('system:userAdvance:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysUserAdvance sysUserAdvance)
    {
        startPage();
        List<SysUserAdvance> list = sysUserAdvanceService.selectSysUserAdvanceList(sysUserAdvance);
        return getDataTable(list);
    }

    /**
     * 导出会员预约列表
     */
    @PreAuthorize("@ss.hasPermi('system:userAdvance:export')")
    @Log(title = "会员预约", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysUserAdvance sysUserAdvance)
    {
        List<SysUserAdvance> list = sysUserAdvanceService.selectSysUserAdvanceList(sysUserAdvance);
        ExcelUtil<SysUserAdvance> util = new ExcelUtil<SysUserAdvance>(SysUserAdvance.class);
        util.exportExcel(response, list, "会员预约数据");
    }

    /**
     * 获取会员预约详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:userAdvance:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysUserAdvanceService.selectSysUserAdvanceById(id));
    }

    /**
     * 新增会员预约
     */
    @PreAuthorize("@ss.hasPermi('system:userAdvance:add')")
    @Log(title = "会员预约", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysUserAdvance sysUserAdvance)
    {
        return toAjax(sysUserAdvanceService.insertSysUserAdvance(sysUserAdvance));
    }

    /**
     * 修改会员预约
     */
    @PreAuthorize("@ss.hasPermi('system:userAdvance:edit')")
    @Log(title = "会员预约", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysUserAdvance sysUserAdvance)
    {
        return toAjax(sysUserAdvanceService.updateSysUserAdvance(sysUserAdvance));
    }

    /**
     * 删除会员预约
     */
    @PreAuthorize("@ss.hasPermi('system:userAdvance:remove')")
    @Log(title = "会员预约", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysUserAdvanceService.deleteSysUserAdvanceByIds(ids));
    }
}
