package com.ruoyi.cmjlkj.service.impl;

import java.util.List;
import java.util.ArrayList;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cmjlkj.mapper.GwMenuMapper;
import com.ruoyi.cmjlkj.domain.GwMenu;
import com.ruoyi.cmjlkj.service.IGwMenuService;
import com.ruoyi.common.core.text.Convert;

/**
 * 官网菜单Service业务层处理
 * 
 * @author L1n4Ch
 * @date 2023-03-13
 */
@Service
public class GwMenuServiceImpl implements IGwMenuService 
{
    @Autowired
    private GwMenuMapper gwMenuMapper;

    /**
     * 查询官网菜单
     * 
     * @param menuId 官网菜单主键
     * @return 官网菜单
     */
    @Override
    public GwMenu selectGwMenuByMenuId(Long menuId)
    {
        return gwMenuMapper.selectGwMenuByMenuId(menuId);
    }

    /**
     * 查询官网菜单列表
     * 
     * @param gwMenu 官网菜单
     * @return 官网菜单
     */
    @Override
    public List<GwMenu> selectGwMenuList(GwMenu gwMenu)
    {
        return gwMenuMapper.selectGwMenuList(gwMenu);
    }

    /**
     * 新增官网菜单
     * 
     * @param gwMenu 官网菜单
     * @return 结果
     */
    @Override
    public int insertGwMenu(GwMenu gwMenu)
    {
        gwMenu.setCreateTime(DateUtils.getNowDate());
        return gwMenuMapper.insertGwMenu(gwMenu);
    }

    /**
     * 修改官网菜单
     * 
     * @param gwMenu 官网菜单
     * @return 结果
     */
    @Override
    public int updateGwMenu(GwMenu gwMenu)
    {
        gwMenu.setUpdateTime(DateUtils.getNowDate());
        return gwMenuMapper.updateGwMenu(gwMenu);
    }

    /**
     * 批量删除官网菜单
     * 
     * @param menuIds 需要删除的官网菜单主键
     * @return 结果
     */
    @Override
    public int deleteGwMenuByMenuIds(String menuIds)
    {
        return gwMenuMapper.deleteGwMenuByMenuIds(Convert.toStrArray(menuIds));
    }

    /**
     * 删除官网菜单信息
     * 
     * @param menuId 官网菜单主键
     * @return 结果
     */
    @Override
    public int deleteGwMenuByMenuId(Long menuId)
    {
        return gwMenuMapper.deleteGwMenuByMenuId(menuId);
    }

    /**
     * 查询官网菜单树列表
     * 
     * @return 所有官网菜单信息
     */
    @Override
    public List<Ztree> selectGwMenuTree()
    {
        List<GwMenu> gwMenuList = gwMenuMapper.selectGwMenuList(new GwMenu());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (GwMenu gwMenu : gwMenuList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(gwMenu.getMenuId());
            ztree.setpId(gwMenu.getParentId());
            ztree.setName(gwMenu.getMenuName());
            ztree.setTitle(gwMenu.getMenuName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
