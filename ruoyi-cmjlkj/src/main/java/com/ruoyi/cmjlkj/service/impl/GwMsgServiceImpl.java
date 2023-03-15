package com.ruoyi.cmjlkj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cmjlkj.mapper.GwMsgMapper;
import com.ruoyi.cmjlkj.domain.GwMsg;
import com.ruoyi.cmjlkj.service.IGwMsgService;
import com.ruoyi.common.core.text.Convert;

/**
 * 留言管理Service业务层处理
 * 
 * @author L1n4Ch
 * @date 2023-03-15
 */
@Service
public class GwMsgServiceImpl implements IGwMsgService 
{
    @Autowired
    private GwMsgMapper gwMsgMapper;

    /**
     * 查询留言管理
     * 
     * @param msgId 留言管理主键
     * @return 留言管理
     */
    @Override
    public GwMsg selectGwMsgByMsgId(Long msgId)
    {
        return gwMsgMapper.selectGwMsgByMsgId(msgId);
    }

    /**
     * 查询留言管理列表
     * 
     * @param gwMsg 留言管理
     * @return 留言管理
     */
    @Override
    public List<GwMsg> selectGwMsgList(GwMsg gwMsg)
    {
        return gwMsgMapper.selectGwMsgList(gwMsg);
    }

    /**
     * 新增留言管理
     * 
     * @param gwMsg 留言管理
     * @return 结果
     */
    @Override
    public int insertGwMsg(GwMsg gwMsg)
    {
        return gwMsgMapper.insertGwMsg(gwMsg);
    }

    /**
     * 修改留言管理
     * 
     * @param gwMsg 留言管理
     * @return 结果
     */
    @Override
    public int updateGwMsg(GwMsg gwMsg)
    {
        return gwMsgMapper.updateGwMsg(gwMsg);
    }

    /**
     * 批量删除留言管理
     * 
     * @param msgIds 需要删除的留言管理主键
     * @return 结果
     */
    @Override
    public int deleteGwMsgByMsgIds(String msgIds)
    {
        return gwMsgMapper.deleteGwMsgByMsgIds(Convert.toStrArray(msgIds));
    }

    /**
     * 删除留言管理信息
     * 
     * @param msgId 留言管理主键
     * @return 结果
     */
    @Override
    public int deleteGwMsgByMsgId(Long msgId)
    {
        return gwMsgMapper.deleteGwMsgByMsgId(msgId);
    }
}
