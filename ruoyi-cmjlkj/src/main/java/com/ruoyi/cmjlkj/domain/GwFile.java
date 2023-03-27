package com.ruoyi.cmjlkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文件信息对象 gw_file
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
public class GwFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long fId;

    /** 文件类型(0图片 1pdf) */
    @Excel(name = "文件类型(0图片 1pdf)")
    private String fileType;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String fileName;

    /** 文件大小 */
    @Excel(name = "文件大小")
    private String fileSize;

    /** 文件地址 */
    @Excel(name = "文件地址")
    private String fileAddr;

    /** 文件路径 */
    @Excel(name = "文件路径")
    private String fileUrl;

    public void setfId(Long fId) 
    {
        this.fId = fId;
    }

    public Long getfId() 
    {
        return fId;
    }
    public void setFileType(String fileType) 
    {
        this.fileType = fileType;
    }

    public String getFileType() 
    {
        return fileType;
    }
    public void setFileName(String fileName) 
    {
        this.fileName = fileName;
    }

    public String getFileName() 
    {
        return fileName;
    }
    public void setFileSize(String fileSize) 
    {
        this.fileSize = fileSize;
    }

    public String getFileSize() 
    {
        return fileSize;
    }
    public void setFileAddr(String fileAddr) 
    {
        this.fileAddr = fileAddr;
    }

    public String getFileAddr() 
    {
        return fileAddr;
    }
    public void setFileUrl(String fileUrl) 
    {
        this.fileUrl = fileUrl;
    }

    public String getFileUrl() 
    {
        return fileUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fId", getfId())
            .append("fileType", getFileType())
            .append("fileName", getFileName())
            .append("fileSize", getFileSize())
            .append("fileAddr", getFileAddr())
            .append("fileUrl", getFileUrl())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
