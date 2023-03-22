package com.ruoyi.cmjlkj.mapper;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwTask;

/**
 * 工作任务分解表Mapper接口
 * 
 * @author L1n4Ch
 * @date 2023-03-22
 */
public interface GwTaskMapper 
{
    /**
     * 查询工作任务分解表
     * 
     * @param tId 工作任务分解表主键
     * @return 工作任务分解表
     */
    public GwTask selectGwTaskByTId(Long tId);

    /**
     * 查询工作任务分解表列表
     * 
     * @param gwTask 工作任务分解表
     * @return 工作任务分解表集合
     */
    public List<GwTask> selectGwTaskList(GwTask gwTask);

    /**
     * 新增工作任务分解表
     * 
     * @param gwTask 工作任务分解表
     * @return 结果
     */
    public int insertGwTask(GwTask gwTask);

    /**
     * 修改工作任务分解表
     * 
     * @param gwTask 工作任务分解表
     * @return 结果
     */
    public int updateGwTask(GwTask gwTask);

    /**
     * 删除工作任务分解表
     * 
     * @param tId 工作任务分解表主键
     * @return 结果
     */
    public int deleteGwTaskByTId(Long tId);

    /**
     * 批量删除工作任务分解表
     * 
     * @param tIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGwTaskByTIds(String[] tIds);
}
