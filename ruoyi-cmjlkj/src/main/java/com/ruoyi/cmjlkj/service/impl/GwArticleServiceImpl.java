package com.ruoyi.cmjlkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cmjlkj.mapper.GwArticleMapper;
import com.ruoyi.cmjlkj.domain.GwArticle;
import com.ruoyi.cmjlkj.service.IGwArticleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 文章发布Service业务层处理
 * 
 * @author L1n4Ch
 * @date 2023-03-13
 */
@Service
public class GwArticleServiceImpl implements IGwArticleService 
{
    @Autowired
    private GwArticleMapper gwArticleMapper;

    /**
     * 查询文章发布
     * 
     * @param articleId 文章发布主键
     * @return 文章发布
     */
    @Override
    public GwArticle selectGwArticleByArticleId(Long articleId)
    {
        return gwArticleMapper.selectGwArticleByArticleId(articleId);
    }

    /**
     * 查询文章发布列表
     * 
     * @param gwArticle 文章发布
     * @return 文章发布
     */
    @Override
    public List<GwArticle> selectGwArticleList(GwArticle gwArticle)
    {
        return gwArticleMapper.selectGwArticleList(gwArticle);
    }

    /**
     * 新增文章发布
     * 
     * @param gwArticle 文章发布
     * @return 结果
     */
    @Override
    public int insertGwArticle(GwArticle gwArticle)
    {
        gwArticle.setCreateTime(DateUtils.getNowDate());
        return gwArticleMapper.insertGwArticle(gwArticle);
    }

    /**
     * 修改文章发布
     * 
     * @param gwArticle 文章发布
     * @return 结果
     */
    @Override
    public int updateGwArticle(GwArticle gwArticle)
    {
        gwArticle.setUpdateTime(DateUtils.getNowDate());
        return gwArticleMapper.updateGwArticle(gwArticle);
    }

    /**
     * 批量删除文章发布
     * 
     * @param articleIds 需要删除的文章发布主键
     * @return 结果
     */
    @Override
    public int deleteGwArticleByArticleIds(String articleIds)
    {
        return gwArticleMapper.deleteGwArticleByArticleIds(Convert.toStrArray(articleIds));
    }

    /**
     * 删除文章发布信息
     * 
     * @param articleId 文章发布主键
     * @return 结果
     */
    @Override
    public int deleteGwArticleByArticleId(Long articleId)
    {
        return gwArticleMapper.deleteGwArticleByArticleId(articleId);
    }
}
