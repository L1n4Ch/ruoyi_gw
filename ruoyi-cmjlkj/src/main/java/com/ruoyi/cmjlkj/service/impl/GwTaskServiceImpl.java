package com.ruoyi.cmjlkj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cmjlkj.mapper.GwTaskMapper;
import com.ruoyi.cmjlkj.domain.GwTask;
import com.ruoyi.cmjlkj.service.IGwTaskService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作任务分解表Service业务层处理
 * 
 * @author L1n4Ch
 * @date 2023-03-22
 */
@Service
public class GwTaskServiceImpl implements IGwTaskService 
{
    @Autowired
    private GwTaskMapper gwTaskMapper;

    /**
     * 查询工作任务分解表
     * 
     * @param tId 工作任务分解表主键
     * @return 工作任务分解表
     */
    @Override
    public GwTask selectGwTaskByTId(Long tId)
    {
        return gwTaskMapper.selectGwTaskByTId(tId);
    }

    /**
     * 查询工作任务分解表列表
     * 
     * @param gwTask 工作任务分解表
     * @return 工作任务分解表
     */
    @Override
    public List<GwTask> selectGwTaskList(GwTask gwTask)
    {
        return gwTaskMapper.selectGwTaskList(gwTask);
    }

    /**
     * 新增工作任务分解表
     * 
     * @param gwTask 工作任务分解表
     * @return 结果
     */
    @Override
    public int insertGwTask(GwTask gwTask)
    {
        gwTask.setCreateTime(DateUtils.getNowDate());
        return gwTaskMapper.insertGwTask(gwTask);
    }

    /**
     * 修改工作任务分解表
     * 
     * @param gwTask 工作任务分解表
     * @return 结果
     */
    @Override
    public int updateGwTask(GwTask gwTask)
    {
        gwTask.setUpdateTime(DateUtils.getNowDate());
        return gwTaskMapper.updateGwTask(gwTask);
    }

    /**
     * 批量删除工作任务分解表
     * 
     * @param tIds 需要删除的工作任务分解表主键
     * @return 结果
     */
    @Override
    public int deleteGwTaskByTIds(String tIds)
    {
        return gwTaskMapper.deleteGwTaskByTIds(Convert.toStrArray(tIds));
    }

    /**
     * 删除工作任务分解表信息
     * 
     * @param tId 工作任务分解表主键
     * @return 结果
     */
    @Override
    public int deleteGwTaskByTId(Long tId)
    {
        return gwTaskMapper.deleteGwTaskByTId(tId);
    }
}
