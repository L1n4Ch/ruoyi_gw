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
import com.ruoyi.cmjlkj.domain.GwFile;
import com.ruoyi.cmjlkj.service.IGwFileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文件信息Controller
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
@Controller
@RequestMapping("/cmjlkj/file")
public class GwFileController extends BaseController
{
    private String prefix = "cmjlkj/file";

    @Autowired
    private IGwFileService gwFileService;

    @RequiresPermissions("cmjlkj:file:view")
    @GetMapping()
    public String file()
    {
        return prefix + "/file";
    }

    /**
     * 查询文件信息列表
     */
    @RequiresPermissions("cmjlkj:file:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwFile gwFile)
    {
        startPage();
        List<GwFile> list = gwFileService.selectGwFileList(gwFile);
        return getDataTable(list);
    }

    /**
     * 导出文件信息列表
     */
    @RequiresPermissions("cmjlkj:file:export")
    @Log(title = "文件信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwFile gwFile)
    {
        List<GwFile> list = gwFileService.selectGwFileList(gwFile);
        ExcelUtil<GwFile> util = new ExcelUtil<GwFile>(GwFile.class);
        return util.exportExcel(list, "文件信息数据");
    }

    /**
     * 新增文件信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存文件信息
     */
    @RequiresPermissions("cmjlkj:file:add")
    @Log(title = "文件信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwFile gwFile)
    {
        return toAjax(gwFileService.insertGwFile(gwFile));
    }

    /**
     * 修改文件信息
     */
    @RequiresPermissions("cmjlkj:file:edit")
    @GetMapping("/edit/{fId}")
    public String edit(@PathVariable("fId") Long fId, ModelMap mmap)
    {
        GwFile gwFile = gwFileService.selectGwFileByFId(fId);
        mmap.put("gwFile", gwFile);
        return prefix + "/edit";
    }

    /**
     * 修改保存文件信息
     */
    @RequiresPermissions("cmjlkj:file:edit")
    @Log(title = "文件信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwFile gwFile)
    {
        return toAjax(gwFileService.updateGwFile(gwFile));
    }

    /**
     * 删除文件信息
     */
    @RequiresPermissions("cmjlkj:file:remove")
    @Log(title = "文件信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwFileService.deleteGwFileByFIds(ids));
    }
}
