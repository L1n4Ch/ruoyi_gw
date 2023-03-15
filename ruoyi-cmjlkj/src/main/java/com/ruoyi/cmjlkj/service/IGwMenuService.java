package com.ruoyi.cmjlkj.service;

import java.util.List;
import com.ruoyi.cmjlkj.domain.GwMenu;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 官网菜单Service接口
 * 
 * @author L1n4Ch
 * @date 2023-03-13
 */
public interface IGwMenuService 
{
    /**
     * 查询官网菜单
     * 
     * @param menuId 官网菜单主键
     * @return 官网菜单
     */
    public GwMenu selectGwMenuByMenuId(Long menuId);

    /**
     * 查询官网菜单列表
     * 
     * @param gwMenu 官网菜单
     * @return 官网菜单集合
     */
    public List<GwMenu> selectGwMenuList(GwMenu gwMenu);

    /**
     * 新增官网菜单
     * 
     * @param gwMenu 官网菜单
     * @return 结果
     */
    public int insertGwMenu(GwMenu gwMenu);

    /**
     * 修改官网菜单
     * 
     * @param gwMenu 官网菜单
     * @return 结果
     */
    public int updateGwMenu(GwMenu gwMenu);

    /**
     * 批量删除官网菜单
     * 
     * @param menuIds 需要删除的官网菜单主键集合
     * @return 结果
     */
    public int deleteGwMenuByMenuIds(String menuIds);

    /**
     * 删除官网菜单信息
     * 
     * @param menuId 官网菜单主键
     * @return 结果
     */
    public int deleteGwMenuByMenuId(Long menuId);

    /**
     * 查询官网菜单树列表
     * 
     * @return 所有官网菜单信息
     */
    public List<Ztree> selectGwMenuTree();
}
