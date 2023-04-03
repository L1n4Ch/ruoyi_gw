package com.ruoyi.cmjlkj.controller;

import com.ruoyi.cmjlkj.domain.GwArticle;
import com.ruoyi.cmjlkj.service.IGwArticleService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章发布Controller
 *
 * @author L1n4Ch
 * @date 2023-03-13
 */
@Controller
@RequestMapping("/cmjlkj/article")
public class GwArticleController extends BaseController
{
    private String prefix = "cmjlkj/article";

    @Autowired
    private IGwArticleService gwArticleService;

    @RequiresPermissions("cmjlkj:article:view")
    @GetMapping()
    public String article()
    {
        return prefix + "/article";
    }

    /**
     * 查询文章发布列表
     */
    @RequiresPermissions("cmjlkj:article:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwArticle gwArticle)
    {
        startPage();
        List<GwArticle> list = gwArticleService.selectGwArticleList(gwArticle);
        return getDataTable(list);
    }

    /**
     * 导出文章发布列表
     */
    @RequiresPermissions("cmjlkj:article:export")
    @Log(title = "文章发布", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwArticle gwArticle)
    {
        List<GwArticle> list = gwArticleService.selectGwArticleList(gwArticle);
        ExcelUtil<GwArticle> util = new ExcelUtil<GwArticle>(GwArticle.class);
        return util.exportExcel(list, "文章发布数据");
    }

    /**
     * 新增文章发布
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存文章发布
     */
    @RequiresPermissions("cmjlkj:article:add")
    @Log(title = "文章发布", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwArticle gwArticle)
    {
        return toAjax(gwArticleService.insertGwArticle(gwArticle));
    }

    /**
     * 修改文章发布
     */
    @RequiresPermissions("cmjlkj:article:edit")
    @GetMapping("/edit/{articleId}")
    public String edit(@PathVariable("articleId") Long articleId, ModelMap mmap)
    {
        GwArticle gwArticle = gwArticleService.selectGwArticleByArticleId(articleId);
        mmap.put("gwArticle", gwArticle);
        return prefix + "/edit";
    }

    /**
     * 修改保存文章发布
     */
    @RequiresPermissions("cmjlkj:article:edit")
    @Log(title = "文章发布", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwArticle gwArticle)
    {
        return toAjax(gwArticleService.updateGwArticle(gwArticle));
    }

    /**
     * 删除文章发布
     */
    @RequiresPermissions("cmjlkj:article:remove")
    @Log(title = "文章发布", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwArticleService.deleteGwArticleByArticleIds(ids));
    }
}
