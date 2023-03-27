package com.ruoyi.cmjlkj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础信息对象 gw_info
 * 
 * @author L1n4Ch
 * @date 2023-03-27
 */
public class GwInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long baseId;

    /** 网站名称 */
    @Excel(name = "网站名称")
    private String name;

    /** qq */
    @Excel(name = "qq")
    private String qq;

    /** 新浪微博名称 */
    @Excel(name = "新浪微博名称")
    private String xlBlog;

    /** 腾讯微博名称 */
    @Excel(name = "腾讯微博名称")
    private String txBlog;

    /** 公众微信名称 */
    @Excel(name = "公众微信名称")
    private String wxName;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 网站地址 */
    @Excel(name = "网站地址")
    private String website;

    /** 备案号 */
    @Excel(name = "备案号")
    private String icp;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String iphone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 传真 */
    @Excel(name = "传真")
    private String fax;

    public void setBaseId(Long baseId) 
    {
        this.baseId = baseId;
    }

    public Long getBaseId() 
    {
        return baseId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setQq(String qq) 
    {
        this.qq = qq;
    }

    public String getQq() 
    {
        return qq;
    }
    public void setXlBlog(String xlBlog) 
    {
        this.xlBlog = xlBlog;
    }

    public String getXlBlog() 
    {
        return xlBlog;
    }
    public void setTxBlog(String txBlog) 
    {
        this.txBlog = txBlog;
    }

    public String getTxBlog() 
    {
        return txBlog;
    }
    public void setWxName(String wxName) 
    {
        this.wxName = wxName;
    }

    public String getWxName() 
    {
        return wxName;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setWebsite(String website) 
    {
        this.website = website;
    }

    public String getWebsite() 
    {
        return website;
    }
    public void setIcp(String icp) 
    {
        this.icp = icp;
    }

    public String getIcp() 
    {
        return icp;
    }
    public void setIphone(String iphone) 
    {
        this.iphone = iphone;
    }

    public String getIphone() 
    {
        return iphone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setFax(String fax) 
    {
        this.fax = fax;
    }

    public String getFax() 
    {
        return fax;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("baseId", getBaseId())
            .append("name", getName())
            .append("qq", getQq())
            .append("xlBlog", getXlBlog())
            .append("txBlog", getTxBlog())
            .append("wxName", getWxName())
            .append("address", getAddress())
            .append("website", getWebsite())
            .append("icp", getIcp())
            .append("iphone", getIphone())
            .append("email", getEmail())
            .append("fax", getFax())
            .toString();
    }
}
