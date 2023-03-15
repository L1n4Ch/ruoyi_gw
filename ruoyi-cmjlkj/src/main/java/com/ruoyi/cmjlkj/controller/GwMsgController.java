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
import com.ruoyi.cmjlkj.domain.GwMsg;
import com.ruoyi.cmjlkj.service.IGwMsgService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 留言管理Controller
 * 
 * @author L1n4Ch
 * @date 2023-03-15
 */
@Controller
@RequestMapping("/cmjlkj/msg")
public class GwMsgController extends BaseController
{
    private String prefix = "cmjlkj/msg";

    @Autowired
    private IGwMsgService gwMsgService;

    @RequiresPermissions("cmjlkj:msg:view")
    @GetMapping()
    public String msg()
    {
        return prefix + "/msg";
    }

    /**
     * 查询留言管理列表
     */
    @RequiresPermissions("cmjlkj:msg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwMsg gwMsg)
    {
        startPage();
        List<GwMsg> list = gwMsgService.selectGwMsgList(gwMsg);
        return getDataTable(list);
    }

    /**
     * 导出留言管理列表
     */
    @RequiresPermissions("cmjlkj:msg:export")
    @Log(title = "留言管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwMsg gwMsg)
    {
        List<GwMsg> list = gwMsgService.selectGwMsgList(gwMsg);
        ExcelUtil<GwMsg> util = new ExcelUtil<GwMsg>(GwMsg.class);
        return util.exportExcel(list, "留言管理数据");
    }

    /**
     * 新增留言管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存留言管理
     */
    @RequiresPermissions("cmjlkj:msg:add")
    @Log(title = "留言管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwMsg gwMsg)
    {
        return toAjax(gwMsgService.insertGwMsg(gwMsg));
    }

    /**
     * 修改留言管理
     */
    @RequiresPermissions("cmjlkj:msg:edit")
    @GetMapping("/edit/{msgId}")
    public String edit(@PathVariable("msgId") Long msgId, ModelMap mmap)
    {
        GwMsg gwMsg = gwMsgService.selectGwMsgByMsgId(msgId);
        mmap.put("gwMsg", gwMsg);
        return prefix + "/edit";
    }

    /**
     * 修改保存留言管理
     */
    @RequiresPermissions("cmjlkj:msg:edit")
    @Log(title = "留言管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwMsg gwMsg)
    {
        return toAjax(gwMsgService.updateGwMsg(gwMsg));
    }

    /**
     * 删除留言管理
     */
    @RequiresPermissions("cmjlkj:msg:remove")
    @Log(title = "留言管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwMsgService.deleteGwMsgByMsgIds(ids));
    }
}
