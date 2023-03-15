package com.ruoyi.cmjlkj.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 留言管理对象 gw_msg
 * 
 * @author L1n4Ch
 * @date 2023-03-15
 */
public class GwMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long msgId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String msgUser;

    /** 电话 */
    @Excel(name = "电话")
    private String msgPhone;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String msgEmail;

    /** 留言内容 */
    @Excel(name = "留言内容")
    private String msgDetail;

    /** 留言时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "留言时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date msgTime;

    /** 回复内容 */
    private String msgAnswer;

    /** 回复时间 */
    private Date msgAnswerTime;

    public void setMsgId(Long msgId) 
    {
        this.msgId = msgId;
    }

    public Long getMsgId() 
    {
        return msgId;
    }
    public void setMsgUser(String msgUser) 
    {
        this.msgUser = msgUser;
    }

    public String getMsgUser() 
    {
        return msgUser;
    }
    public void setMsgPhone(String msgPhone) 
    {
        this.msgPhone = msgPhone;
    }

    public String getMsgPhone() 
    {
        return msgPhone;
    }
    public void setMsgEmail(String msgEmail) 
    {
        this.msgEmail = msgEmail;
    }

    public String getMsgEmail() 
    {
        return msgEmail;
    }
    public void setMsgDetail(String msgDetail) 
    {
        this.msgDetail = msgDetail;
    }

    public String getMsgDetail() 
    {
        return msgDetail;
    }
    public void setMsgTime(Date msgTime) 
    {
        this.msgTime = msgTime;
    }

    public Date getMsgTime() 
    {
        return msgTime;
    }
    public void setMsgAnswer(String msgAnswer) 
    {
        this.msgAnswer = msgAnswer;
    }

    public String getMsgAnswer() 
    {
        return msgAnswer;
    }
    public void setMsgAnswerTime(Date msgAnswerTime) 
    {
        this.msgAnswerTime = msgAnswerTime;
    }

    public Date getMsgAnswerTime() 
    {
        return msgAnswerTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("msgId", getMsgId())
            .append("msgUser", getMsgUser())
            .append("msgPhone", getMsgPhone())
            .append("msgEmail", getMsgEmail())
            .append("msgDetail", getMsgDetail())
            .append("msgTime", getMsgTime())
            .append("msgAnswer", getMsgAnswer())
            .append("msgAnswerTime", getMsgAnswerTime())
            .toString();
    }
}
