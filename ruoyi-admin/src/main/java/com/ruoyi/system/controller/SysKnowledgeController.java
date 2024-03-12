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
import com.ruoyi.system.domain.SysKnowledge;
import com.ruoyi.system.service.ISysKnowledgeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 拳馆常识Controller
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@RestController
@RequestMapping("/system/knowledge")
public class SysKnowledgeController extends BaseController
{
    @Autowired
    private ISysKnowledgeService sysKnowledgeService;

    /**
     * 查询拳馆常识列表
     */
    @PreAuthorize("@ss.hasPermi('system:knowledge:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysKnowledge sysKnowledge)
    {
        startPage();
        List<SysKnowledge> list = sysKnowledgeService.selectSysKnowledgeList(sysKnowledge);
        return getDataTable(list);
    }

    /**
     * 导出拳馆常识列表
     */
    @PreAuthorize("@ss.hasPermi('system:knowledge:export')")
    @Log(title = "拳馆常识", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysKnowledge sysKnowledge)
    {
        List<SysKnowledge> list = sysKnowledgeService.selectSysKnowledgeList(sysKnowledge);
        ExcelUtil<SysKnowledge> util = new ExcelUtil<SysKnowledge>(SysKnowledge.class);
        util.exportExcel(response, list, "拳馆常识数据");
    }

    /**
     * 获取拳馆常识详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:knowledge:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysKnowledgeService.selectSysKnowledgeById(id));
    }

    /**
     * 新增拳馆常识
     */
    @PreAuthorize("@ss.hasPermi('system:knowledge:add')")
    @Log(title = "拳馆常识", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysKnowledge sysKnowledge)
    {
        return toAjax(sysKnowledgeService.insertSysKnowledge(sysKnowledge));
    }

    /**
     * 修改拳馆常识
     */
    @PreAuthorize("@ss.hasPermi('system:knowledge:edit')")
    @Log(title = "拳馆常识", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysKnowledge sysKnowledge)
    {
        return toAjax(sysKnowledgeService.updateSysKnowledge(sysKnowledge));
    }

    /**
     * 删除拳馆常识
     */
    @PreAuthorize("@ss.hasPermi('system:knowledge:remove')")
    @Log(title = "拳馆常识", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysKnowledgeService.deleteSysKnowledgeByIds(ids));
    }
}
