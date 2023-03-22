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
import com.ruoyi.cmjlkj.domain.GwTask;
import com.ruoyi.cmjlkj.service.IGwTaskService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工作任务分解表Controller
 * 
 * @author L1n4Ch
 * @date 2023-03-22
 */
@Controller
@RequestMapping("/cmjlkj/task")
public class GwTaskController extends BaseController
{
    private String prefix = "cmjlkj/task";

    @Autowired
    private IGwTaskService gwTaskService;

    @RequiresPermissions("cmjlkj:task:view")
    @GetMapping()
    public String task()
    {
        return prefix + "/task";
    }

    /**
     * 查询工作任务分解表列表
     */
    @RequiresPermissions("cmjlkj:task:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwTask gwTask)
    {
        startPage();
        List<GwTask> list = gwTaskService.selectGwTaskList(gwTask);
        return getDataTable(list);
    }

    /**
     * 导出工作任务分解表列表
     */
    @RequiresPermissions("cmjlkj:task:export")
    @Log(title = "工作任务分解表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwTask gwTask)
    {
        List<GwTask> list = gwTaskService.selectGwTaskList(gwTask);
        ExcelUtil<GwTask> util = new ExcelUtil<GwTask>(GwTask.class);
        return util.exportExcel(list, "工作任务分解表数据");
    }

    /**
     * 新增工作任务分解表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工作任务分解表
     */
    @RequiresPermissions("cmjlkj:task:add")
    @Log(title = "工作任务分解表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwTask gwTask)
    {
        return toAjax(gwTaskService.insertGwTask(gwTask));
    }

    /**
     * 修改工作任务分解表
     */
    @RequiresPermissions("cmjlkj:task:edit")
    @GetMapping("/edit/{tId}")
    public String edit(@PathVariable("tId") Long tId, ModelMap mmap)
    {
        GwTask gwTask = gwTaskService.selectGwTaskByTId(tId);
        mmap.put("gwTask", gwTask);
        return prefix + "/edit";
    }

    /**
     * 修改保存工作任务分解表
     */
    @RequiresPermissions("cmjlkj:task:edit")
    @Log(title = "工作任务分解表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwTask gwTask)
    {
        return toAjax(gwTaskService.updateGwTask(gwTask));
    }

    /**
     * 删除工作任务分解表
     */
    @RequiresPermissions("cmjlkj:task:remove")
    @Log(title = "工作任务分解表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwTaskService.deleteGwTaskByTIds(ids));
    }
}
