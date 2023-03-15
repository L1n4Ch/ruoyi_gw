package com.ruoyi.cmjlkj.mapper;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwArticle;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章发布Mapper接口
 * 
 * @author L1n4Ch
 * @date 2023-03-13
 */
@Mapper
public interface GwArticleMapper 
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
     * 删除文章发布
     * 
     * @param articleId 文章发布主键
     * @return 结果
     */
    public int deleteGwArticleByArticleId(Long articleId);

    /**
     * 批量删除文章发布
     * 
     * @param articleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGwArticleByArticleIds(String[] articleIds);
}
