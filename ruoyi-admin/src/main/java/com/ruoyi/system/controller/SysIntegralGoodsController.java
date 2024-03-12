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
import com.ruoyi.system.domain.SysIntegralGoods;
import com.ruoyi.system.service.ISysIntegralGoodsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品积分Controller
 * 
 * @author ruoyi
 * @date 2024-03-12
 */
@RestController
@RequestMapping("/system/integral-goods")
public class SysIntegralGoodsController extends BaseController
{
    @Autowired
    private ISysIntegralGoodsService sysIntegralGoodsService;

    /**
     * 查询商品积分列表
     */
    @PreAuthorize("@ss.hasPermi('system:integralGoods:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysIntegralGoods sysIntegralGoods)
    {
        startPage();
        List<SysIntegralGoods> list = sysIntegralGoodsService.selectSysIntegralGoodsList(sysIntegralGoods);
        return getDataTable(list);
    }

    /**
     * 导出商品积分列表
     */
    @PreAuthorize("@ss.hasPermi('system:integralGoods:export')")
    @Log(title = "商品积分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysIntegralGoods sysIntegralGoods)
    {
        List<SysIntegralGoods> list = sysIntegralGoodsService.selectSysIntegralGoodsList(sysIntegralGoods);
        ExcelUtil<SysIntegralGoods> util = new ExcelUtil<SysIntegralGoods>(SysIntegralGoods.class);
        util.exportExcel(response, list, "商品积分数据");
    }

    /**
     * 获取商品积分详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:integralGoods:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysIntegralGoodsService.selectSysIntegralGoodsById(id));
    }

    /**
     * 新增商品积分
     */
    @PreAuthorize("@ss.hasPermi('system:integralGoods:add')")
    @Log(title = "商品积分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysIntegralGoods sysIntegralGoods)
    {
        return toAjax(sysIntegralGoodsService.insertSysIntegralGoods(sysIntegralGoods));
    }

    /**
     * 修改商品积分
     */
    @PreAuthorize("@ss.hasPermi('system:integralGoods:edit')")
    @Log(title = "商品积分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysIntegralGoods sysIntegralGoods)
    {
        return toAjax(sysIntegralGoodsService.updateSysIntegralGoods(sysIntegralGoods));
    }

    /**
     * 删除商品积分
     */
    @PreAuthorize("@ss.hasPermi('system:integralGoods:remove')")
    @Log(title = "商品积分", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysIntegralGoodsService.deleteSysIntegralGoodsByIds(ids));
    }
}
