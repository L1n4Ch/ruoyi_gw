package com.ruoyi.cmjlkj.service;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwArticle;

/**
 * 文章发布Service接口
 * 
 * @author L1n4Ch
 * @date 2023-03-13
 */
public interface IGwArticleService 
{
    /**
     * 查询文章发布
     * 
     * @param articleId 文章发布主键
     * @return 文章发布
     */
    public GwArticle selectGwArticleByArticleId(Long articleId);

    /**
     * 查询文章发布列表
     * 
     * @param gwArticle 文章发布
     * @return 文章发布集合
     */
    public List<GwArticle> selectGwArticleList(GwArticle gwArticle);

    /**
     * 新增文章发布
     * 
     * @param gwArticle 文章发布
     * @return 结果
     */
    public int insertGwArticle(GwArticle gwArticle);

    /**
     * 修改文章发布
     * 
     * @param gwArticle 文章发布
     * @return 结果
     */
    public int updateGwArticle(GwArticle gwArticle);

    /**
     * 批量删除文章发布
     * 
     * @param articleIds 需要删除的文章发布主键集合
     * @return 结果
     */
    public int deleteGwArticleByArticleIds(String articleIds);

    /**
     * 删除文章发布信息
     * 
     * @param articleId 文章发布主键
     * @return 结果
     */
    public int deleteGwArticleByArticleId(Long articleId);
}
