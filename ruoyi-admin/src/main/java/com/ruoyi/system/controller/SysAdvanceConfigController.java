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
import com.ruoyi.system.domain.SysAdvanceConfig;
import com.ruoyi.system.service.ISysAdvanceConfigService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预约管理Controller
 * 
 * @author ruoyi
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/system/advanceConfig")
public class SysAdvanceConfigController extends BaseController
{
    @Autowired
    private ISysAdvanceConfigService sysAdvanceConfigService;

    /**
     * 查询预约管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:advanceConfig:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysAdvanceConfig sysAdvanceConfig)
    {
        startPage();
        List<SysAdvanceConfig> list = sysAdvanceConfigService.selectSysAdvanceConfigList(sysAdvanceConfig);
        return getDataTable(list);
    }

    /**
     * 导出预约管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:advanceConfig:export')")
    @Log(title = "预约管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysAdvanceConfig sysAdvanceConfig)
    {
        List<SysAdvanceConfig> list = sysAdvanceConfigService.selectSysAdvanceConfigList(sysAdvanceConfig);
        ExcelUtil<SysAdvanceConfig> util = new ExcelUtil<SysAdvanceConfig>(SysAdvanceConfig.class);
        util.exportExcel(response, list, "预约管理数据");
    }

    /**
     * 获取预约管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:advanceConfig:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysAdvanceConfigService.selectSysAdvanceConfigById(id));
    }

    /**
     * 新增预约管理
     */
    @PreAuthorize("@ss.hasPermi('system:advanceConfig:add')")
    @Log(title = "预约管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAdvanceConfig sysAdvanceConfig)
    {
        return toAjax(sysAdvanceConfigService.insertSysAdvanceConfig(sysAdvanceConfig));
    }

    /**
     * 修改预约管理
     */
    @PreAuthorize("@ss.hasPermi('system:advanceConfig:edit')")
    @Log(title = "预约管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAdvanceConfig sysAdvanceConfig)
    {
        return toAjax(sysAdvanceConfigService.updateSysAdvanceConfig(sysAdvanceConfig));
    }

    /**
     * 删除预约管理
     */
    @PreAuthorize("@ss.hasPermi('system:advanceConfig:remove')")
    @Log(title = "预约管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysAdvanceConfigService.deleteSysAdvanceConfigByIds(ids));
    }
}
