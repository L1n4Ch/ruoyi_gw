package com.ruoyi.cmjlkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cmjlkj.mapper.GwFileMapper;
import com.ruoyi.cmjlkj.domain.GwFile;
import com.ruoyi.cmjlkj.service.IGwFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 文件信息Service业务层处理
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
@Service
public class GwFileServiceImpl implements IGwFileService 
{
    @Autowired
    private GwFileMapper gwFileMapper;

    /**
     * 查询文件信息
     * 
     * @param fId 文件信息主键
     * @return 文件信息
     */
    @Override
    public GwFile selectGwFileByFId(Long fId)
    {
        return gwFileMapper.selectGwFileByFId(fId);
    }

    /**
     * 查询文件信息列表
     * 
     * @param gwFile 文件信息
     * @return 文件信息
     */
    @Override
    public List<GwFile> selectGwFileList(GwFile gwFile)
    {
        return gwFileMapper.selectGwFileList(gwFile);
    }

    /**
     * 新增文件信息
     * 
     * @param gwFile 文件信息
     * @return 结果
     */
    @Override
    public int insertGwFile(GwFile gwFile)
    {
        gwFile.setCreateTime(DateUtils.getNowDate());
        return gwFileMapper.insertGwFile(gwFile);
    }

    /**
     * 修改文件信息
     * 
     * @param gwFile 文件信息
     * @return 结果
     */
    @Override
    public int updateGwFile(GwFile gwFile)
    {
        gwFile.setUpdateTime(DateUtils.getNowDate());
        return gwFileMapper.updateGwFile(gwFile);
    }

    /**
     * 批量删除文件信息
     * 
     * @param fIds 需要删除的文件信息主键
     * @return 结果
     */
    @Override
    public int deleteGwFileByFIds(String fIds)
    {
        return gwFileMapper.deleteGwFileByFIds(Convert.toStrArray(fIds));
    }

    /**
     * 删除文件信息信息
     * 
     * @param fId 文件信息主键
     * @return 结果
     */
    @Override
    public int deleteGwFileByFId(Long fId)
    {
        return gwFileMapper.deleteGwFileByFId(fId);
    }
}
