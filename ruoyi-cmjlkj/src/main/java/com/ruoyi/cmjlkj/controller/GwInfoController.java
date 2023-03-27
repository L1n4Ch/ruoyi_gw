package com.ruoyi.cmjlkj.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.cmjlkj.domain.GwInfo;
import com.ruoyi.cmjlkj.service.IGwInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础信息Controller
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
@Controller
@RequestMapping("/cmjlkj/info")
public class GwInfoController extends BaseController
{
    private String prefix = "cmjlkj/info";

    @Autowired
    private IGwInfoService gwInfoService;

    @RequiresPermissions("cmjlkj:info:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询基础信息列表
     */
    @RequiresPermissions("cmjlkj:info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwInfo gwInfo)
    {
        startPage();
        List<GwInfo> list = gwInfoService.selectGwInfoList(gwInfo);
        return getDataTable(list);
    }

    /**
     * 导出基础信息列表
     */
    @RequiresPermissions("cmjlkj:info:export")
    @Log(title = "基础信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwInfo gwInfo)
    {
        List<GwInfo> list = gwInfoService.selectGwInfoList(gwInfo);
        ExcelUtil<GwInfo> util = new ExcelUtil<GwInfo>(GwInfo.class);
        return util.exportExcel(list, "基础信息数据");
    }

    /**
     * 新增基础信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础信息
     */
    @RequiresPermissions("cmjlkj:info:add")
    @Log(title = "基础信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwInfo gwInfo)
    {
        return toAjax(gwInfoService.insertGwInfo(gwInfo));
    }

    /**
     * 修改基础信息
     */
    @RequiresPermissions("cmjlkj:info:edit")
    @GetMapping("/edit/{baseId}")
    public String edit(@PathVariable("baseId") Long baseId, ModelMap mmap)
    {
        GwInfo gwInfo = gwInfoService.selectGwInfoByBaseId(baseId);
        mmap.put("gwInfo", gwInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础信息
     */
    @RequiresPermissions("cmjlkj:info:edit")
    @Log(title = "基础信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwInfo gwInfo)
    {
        return toAjax(gwInfoService.updateGwInfo(gwInfo));
    }

    /**
     * 删除基础信息
     */
    @RequiresPermissions("cmjlkj:info:remove")
    @Log(title = "基础信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwInfoService.deleteGwInfoByBaseIds(ids));
    }
}
