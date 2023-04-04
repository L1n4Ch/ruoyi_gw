package com.ruoyi.web.controller.demo.controller;

import com.ruoyi.cmjlkj.domain.GwArticle;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 模态窗口
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/demo/modal")
public class HomeController {


    /**
     * 模态窗口
     */
    @PostMapping("/home")
    public AjaxResult dialog() {
        Map<String,Object> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            GwArticle gwArticle = new GwArticle();
            gwArticle.setArticleId(Long.valueOf(i));
            gwArticle.setTitle("文章"+i);
            gwArticle.setIntroduce("简介"+i);
            gwArticle.setDetail("详细信息"+i);
            gwArticle.setCreateTime(new Date());
            map.put("gwArticle"+i,gwArticle);
        }
        return AjaxResult.success(map);

    }
    @GetMapping("/getArticleById/{id}")
    public AjaxResult getArticleById(@PathVariable Long id) {

            GwArticle gwArticle = new GwArticle();
            gwArticle.setArticleId(id);
            gwArticle.setTitle("文章");
            gwArticle.setIntroduce("简介");
            gwArticle.setDetail("<p><u>当地时间4月3日，美国前总统特朗普将从佛罗里达前往纽约，准备周二在纽约曼哈顿刑事法院就“封口费”案接受提审。\n" +
                    "\n" +
                    "为应对特朗普的自首，纽约警方严阵以待，封锁了曼哈顿法院附近的多条道路。包括纽约青年共和党俱乐部在内的各个组织已经宣布将举行抗议游行，共和党议员也将参加示威活动。\n" +
                    "\n" +
                    "作为美国首位遭到刑事指控的前总统，特朗普并没有因“封口费”案而人气下跌，反而赢来了支持率小高潮。自曼哈顿大陪审团投票决定起诉特朗普以来的首个民调显示，特朗普不仅在共和党内支持率上涨，总体支持率也出现上涨。\n" +
                    "\n" +
                    "借助此次起诉风波，特朗普的竞选团队疯狂吸金，在24小时内就收到了来自基层支持者的400万美元捐助。</u></p>");
            gwArticle.setCreateTime(new Date());

        return AjaxResult.success(gwArticle);
    }


}
