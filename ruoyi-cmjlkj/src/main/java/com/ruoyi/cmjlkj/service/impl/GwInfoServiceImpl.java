package com.ruoyi.cmjlkj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cmjlkj.mapper.GwInfoMapper;
import com.ruoyi.cmjlkj.domain.GwInfo;
import com.ruoyi.cmjlkj.service.IGwInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础信息Service业务层处理
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
@Service
public class GwInfoServiceImpl implements IGwInfoService 
{
    @Autowired
    private GwInfoMapper gwInfoMapper;

    /**
     * 查询基础信息
     * 
     * @param baseId 基础信息主键
     * @return 基础信息
     */
    @Override
    public GwInfo selectGwInfoByBaseId(Long baseId)
    {
        return gwInfoMapper.selectGwInfoByBaseId(baseId);
    }

    /**
     * 查询基础信息列表
     * 
     * @param gwInfo 基础信息
     * @return 基础信息
     */
    @Override
    public List<GwInfo> selectGwInfoList(GwInfo gwInfo)
    {
        return gwInfoMapper.selectGwInfoList(gwInfo);
    }

    /**
     * 新增基础信息
     * 
     * @param gwInfo 基础信息
     * @return 结果
     */
    @Override
    public int insertGwInfo(GwInfo gwInfo)
    {
        return gwInfoMapper.insertGwInfo(gwInfo);
    }

    /**
     * 修改基础信息
     * 
     * @param gwInfo 基础信息
     * @return 结果
     */
    @Override
    public int updateGwInfo(GwInfo gwInfo)
    {
        return gwInfoMapper.updateGwInfo(gwInfo);
    }

    /**
     * 批量删除基础信息
     * 
     * @param baseIds 需要删除的基础信息主键
     * @return 结果
     */
    @Override
    public int deleteGwInfoByBaseIds(String baseIds)
    {
        return gwInfoMapper.deleteGwInfoByBaseIds(Convert.toStrArray(baseIds));
    }

    /**
     * 删除基础信息信息
     * 
     * @param baseId 基础信息主键
     * @return 结果
     */
    @Override
    public int deleteGwInfoByBaseId(Long baseId)
    {
        return gwInfoMapper.deleteGwInfoByBaseId(baseId);
    }
}
