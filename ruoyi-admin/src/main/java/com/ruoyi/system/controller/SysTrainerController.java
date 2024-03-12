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
import com.ruoyi.system.domain.SysTrainer;
import com.ruoyi.system.service.ISysTrainerService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教练管理Controller
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@RestController
@RequestMapping("/system/trainer")
public class SysTrainerController extends BaseController
{
    @Autowired
    private ISysTrainerService sysTrainerService;

    /**
     * 查询教练管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:trainer:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysTrainer sysTrainer)
    {
        startPage();
        List<SysTrainer> list = sysTrainerService.selectSysTrainerList(sysTrainer);
        return getDataTable(list);
    }

    /**
     * 导出教练管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:trainer:export')")
    @Log(title = "教练管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysTrainer sysTrainer)
    {
        List<SysTrainer> list = sysTrainerService.selectSysTrainerList(sysTrainer);
        ExcelUtil<SysTrainer> util = new ExcelUtil<SysTrainer>(SysTrainer.class);
        util.exportExcel(response, list, "教练管理数据");
    }

    /**
     * 获取教练管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:trainer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysTrainerService.selectSysTrainerById(id));
    }

    /**
     * 新增教练管理
     */
    @PreAuthorize("@ss.hasPermi('system:trainer:add')")
    @Log(title = "教练管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysTrainer sysTrainer)
    {
        return toAjax(sysTrainerService.insertSysTrainer(sysTrainer));
    }

    /**
     * 修改教练管理
     */
    @PreAuthorize("@ss.hasPermi('system:trainer:edit')")
    @Log(title = "教练管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysTrainer sysTrainer)
    {
        return toAjax(sysTrainerService.updateSysTrainer(sysTrainer));
    }

    /**
     * 删除教练管理
     */
    @PreAuthorize("@ss.hasPermi('system:trainer:remove')")
    @Log(title = "教练管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysTrainerService.deleteSysTrainerByIds(ids));
    }
}
