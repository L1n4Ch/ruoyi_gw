package com.ruoyi.cmjlkj.service;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwMsg;

/**
 * 留言管理Service接口
 * 
 * @author L1n4Ch
 * @date 2023-03-15
 */
public interface IGwMsgService 
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
     * 批量删除留言管理
     * 
     * @param msgIds 需要删除的留言管理主键集合
     * @return 结果
     */
    public int deleteGwMsgByMsgIds(String msgIds);

    /**
     * 删除留言管理信息
     * 
     * @param msgId 留言管理主键
     * @return 结果
     */
    public int deleteGwMsgByMsgId(Long msgId);
}
