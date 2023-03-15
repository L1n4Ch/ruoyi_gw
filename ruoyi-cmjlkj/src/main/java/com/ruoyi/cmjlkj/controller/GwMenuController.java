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
import com.ruoyi.cmjlkj.domain.GwMenu;
import com.ruoyi.cmjlkj.service.IGwMenuService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 官网菜单Controller
 * 
 * @author L1n4Ch
 * @date 2023-03-13
 */
@Controller
@RequestMapping("/cmjlkj/menu")
public class GwMenuController extends BaseController
{
    private String prefix = "cmjlkj/menu";

    @Autowired
    private IGwMenuService gwMenuService;

    @RequiresPermissions("cmjlkj:menu:view")
    @GetMapping()
    public String menu()
    {
        return prefix + "/menu";
    }

    /**
     * 查询官网菜单树列表
     */
    @RequiresPermissions("cmjlkj:menu:list")
    @PostMapping("/list")
    @ResponseBody
    public List<GwMenu> list(GwMenu gwMenu)
    {
        List<GwMenu> list = gwMenuService.selectGwMenuList(gwMenu);
        return list;
    }

    /**
     * 导出官网菜单列表
     */
    @RequiresPermissions("cmjlkj:menu:export")
    @Log(title = "官网菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwMenu gwMenu)
    {
        List<GwMenu> list = gwMenuService.selectGwMenuList(gwMenu);
        ExcelUtil<GwMenu> util = new ExcelUtil<GwMenu>(GwMenu.class);
        return util.exportExcel(list, "官网菜单数据");
    }

    /**
     * 新增官网菜单
     */
    @GetMapping(value = { "/add/{menuId}", "/add/" })
    public String add(@PathVariable(value = "menuId", required = false) Long menuId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(menuId))
        {
            mmap.put("gwMenu", gwMenuService.selectGwMenuByMenuId(menuId));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存官网菜单
     */
    @RequiresPermissions("cmjlkj:menu:add")
    @Log(title = "官网菜单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwMenu gwMenu)
    {
        return toAjax(gwMenuService.insertGwMenu(gwMenu));
    }

    /**
     * 修改官网菜单
     */
    @RequiresPermissions("cmjlkj:menu:edit")
    @GetMapping("/edit/{menuId}")
    public String edit(@PathVariable("menuId") Long menuId, ModelMap mmap)
    {
        GwMenu gwMenu = gwMenuService.selectGwMenuByMenuId(menuId);
        mmap.put("gwMenu", gwMenu);
        return prefix + "/edit";
    }

    /**
     * 修改保存官网菜单
     */
    @RequiresPermissions("cmjlkj:menu:edit")
    @Log(title = "官网菜单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwMenu gwMenu)
    {
        return toAjax(gwMenuService.updateGwMenu(gwMenu));
    }

    /**
     * 删除
     */
    @RequiresPermissions("cmjlkj:menu:remove")
    @Log(title = "官网菜单", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{menuId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("menuId") Long menuId)
    {
        return toAjax(gwMenuService.deleteGwMenuByMenuId(menuId));
    }

    /**
     * 选择官网菜单树
     */
    @GetMapping(value = { "/selectMenuTree/{menuId}", "/selectMenuTree/" })
    public String selectMenuTree(@PathVariable(value = "menuId", required = false) Long menuId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(menuId))
        {
            mmap.put("gwMenu", gwMenuService.selectGwMenuByMenuId(menuId));
        }
        return prefix + "/tree";
    }

    /**
     * 加载官网菜单树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = gwMenuService.selectGwMenuTree();
        return ztrees;
    }
}
