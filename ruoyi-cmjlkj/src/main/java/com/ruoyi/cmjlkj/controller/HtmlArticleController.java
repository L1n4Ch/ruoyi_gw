package com.ruoyi.cmjlkj.controller;

import com.ruoyi.cmjlkj.domain.GwArticle;
import com.ruoyi.cmjlkj.service.IGwArticleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wind
 */
@Controller
@RequestMapping("/")
public class HtmlArticleController extends BaseController {

    @Autowired
    private IGwArticleService gwArticleService;

    /**
     * 查询文章发布列表-页面
     */
    @GetMapping("/html/list")
    public String htmlList(ModelMap mmap) {
        GwArticle gwArticle = new GwArticle();
        startPage();
        List<GwArticle> list = gwArticleService.selectGwArticleList(gwArticle);
        TableDataInfo info = getDataTable(list);
        mmap.put("articleTableInfo", info);
        return "/fe/article-list";
//        return "/technotrend/blog-single";
    }

}
