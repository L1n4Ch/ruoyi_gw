package com.ruoyi.cmjlkj.mapper;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwMsg;
import org.apache.ibatis.annotations.Mapper;

/**
 * 留言管理Mapper接口
 * 
 * @author L1n4Ch
 * @date 2023-03-15
 */
@Mapper
public interface GwMsgMapper 
{
    /**
     * 查询留言管理
     * 
     * @param msgId 留言管理主键
     * @return 留言管理
     */
    public GwMsg selectGwMsgByMsgId(Long msgId);

    /**
     * 查询留言管理列表
     * 
     * @param gwMsg 留言管理
     * @return 留言管理集合
     */
    public List<GwMsg> selectGwMsgList(GwMsg gwMsg);

    /**
     * 新增留言管理
     * 
     * @param gwMsg 留言管理
     * @return 结果
     */
    public int insertGwMsg(GwMsg gwMsg);

    /**
     * 修改留言管理
     * 
     * @param gwMsg 留言管理
     * @return 结果
     */
    public int updateGwMsg(GwMsg gwMsg);

    /**
     * 删除留言管理
     * 
     * @param msgId 留言管理主键
     * @return 结果
     */
    public int deleteGwMsgByMsgId(Long msgId);

    /**
     * 批量删除留言管理
     * 
     * @param msgIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGwMsgByMsgIds(String[] msgIds);
}
