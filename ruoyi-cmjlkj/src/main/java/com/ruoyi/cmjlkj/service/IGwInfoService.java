package com.ruoyi.cmjlkj.service;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwInfo;

/**
 * 基础信息Service接口
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
public interface IGwInfoService 
{
    /**
     * 查询基础信息
     * 
     * @param baseId 基础信息主键
     * @return 基础信息
     */
    public GwInfo selectGwInfoByBaseId(Long baseId);

    /**
     * 查询基础信息列表
     * 
     * @param gwInfo 基础信息
     * @return 基础信息集合
     */
    public List<GwInfo> selectGwInfoList(GwInfo gwInfo);

    /**
     * 新增基础信息
     * 
     * @param gwInfo 基础信息
     * @return 结果
     */
    public int insertGwInfo(GwInfo gwInfo);

    /**
     * 修改基础信息
     * 
     * @param gwInfo 基础信息
     * @return 结果
     */
    public int updateGwInfo(GwInfo gwInfo);

    /**
     * 批量删除基础信息
     * 
     * @param baseIds 需要删除的基础信息主键集合
     * @return 结果
     */
    public int deleteGwInfoByBaseIds(String baseIds);

    /**
     * 删除基础信息信息
     * 
     * @param baseId 基础信息主键
     * @return 结果
     */
    public int deleteGwInfoByBaseId(Long baseId);
}
