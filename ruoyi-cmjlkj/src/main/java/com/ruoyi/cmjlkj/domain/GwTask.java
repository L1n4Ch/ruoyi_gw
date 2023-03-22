package com.ruoyi.cmjlkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工作任务分解表对象 gw_task
 * 
 * @author L1n4Ch
 * @date 2023-03-22
 */
public class GwTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long tId;

    /** 责任人 */
    @Excel(name = "责任人")
    private String tName;

    /** 工作内容 */
    @Excel(name = "工作内容")
    private String tContent;

    /** 配合人员 */
    @Excel(name = "配合人员")
    private String tCooperater;

    /** 工作思路 */
    @Excel(name = "工作思路")
    private String tIdea;

    /** 当前阶段目标 */
    @Excel(name = "当前阶段目标")
    private String tTarget;

    /** 备注 */
    @Excel(name = "备注")
    private String tRemark;

    /** 计划完成时间 */
    @Excel(name = "计划完成时间")
    private String finishTime;

    /** 工作布置时间 */
    @Excel(name = "工作布置时间")
    private String startTime;

    public void settId(Long tId) 
    {
        this.tId = tId;
    }

    public Long gettId() 
    {
        return tId;
    }
    public void settName(String tName) 
    {
        this.tName = tName;
    }

    public String gettName() 
    {
        return tName;
    }
    public void settContent(String tContent) 
    {
        this.tContent = tContent;
    }

    public String gettContent() 
    {
        return tContent;
    }
    public void settCooperater(String tCooperater) 
    {
        this.tCooperater = tCooperater;
    }

    public String gettCooperater() 
    {
        return tCooperater;
    }
    public void settIdea(String tIdea) 
    {
        this.tIdea = tIdea;
    }

    public String gettIdea() 
    {
        return tIdea;
    }
    public void settTarget(String tTarget) 
    {
        this.tTarget = tTarget;
    }

    public String gettTarget() 
    {
        return tTarget;
    }
    public void settRemark(String tRemark) 
    {
        this.tRemark = tRemark;
    }

    public String gettRemark() 
    {
        return tRemark;
    }
    public void setFinishTime(String finishTime) 
    {
        this.finishTime = finishTime;
    }

    public String getFinishTime() 
    {
        return finishTime;
    }
    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public String getStartTime() 
    {
        return startTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tId", gettId())
            .append("tName", gettName())
            .append("tContent", gettContent())
            .append("tCooperater", gettCooperater())
            .append("tIdea", gettIdea())
            .append("tTarget", gettTarget())
            .append("tRemark", gettRemark())
            .append("finishTime", getFinishTime())
            .append("startTime", getStartTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
