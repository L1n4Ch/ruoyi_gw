package com.ruoyi.cmjlkj.service;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwFile;

/**
 * 文件信息Service接口
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
public interface IGwFileService 
{
    /**
     * 查询文件信息
     * 
     * @param fId 文件信息主键
     * @return 文件信息
     */
    public GwFile selectGwFileByFId(Long fId);

    /**
     * 查询文件信息列表
     * 
     * @param gwFile 文件信息
     * @return 文件信息集合
     */
    public List<GwFile> selectGwFileList(GwFile gwFile);

    /**
     * 新增文件信息
     * 
     * @param gwFile 文件信息
     * @return 结果
     */
    public int insertGwFile(GwFile gwFile);

    /**
     * 修改文件信息
     * 
     * @param gwFile 文件信息
     * @return 结果
     */
    public int updateGwFile(GwFile gwFile);

    /**
     * 批量删除文件信息
     * 
     * @param fIds 需要删除的文件信息主键集合
     * @return 结果
     */
    public int deleteGwFileByFIds(String fIds);

    /**
     * 删除文件信息信息
     * 
     * @param fId 文件信息主键
     * @return 结果
     */
    public int deleteGwFileByFId(Long fId);
}
