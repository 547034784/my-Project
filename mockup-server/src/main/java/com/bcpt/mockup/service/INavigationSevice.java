package com.bcpt.mockup.service;

import com.bcpt.mockup.entity.NavigationEntity;
import java.util.List;

/**
 *  导航栏管理
 * @author  杨浩
 */
public interface INavigationSevice {

    /**
     *   添加导航栏
     * @param navigationEntity  导航栏对象
     */
    public void addNavigation(NavigationEntity navigationEntity);

    /**
     *  初始化页面时获取所有导航栏
     * @return  导航栏集合
     */
    public List<NavigationEntity> getAllvavs();

    /**
     *  修改导航栏
     * @param navigationEntity  导航栏对象
     */
    public void updatenavigation(NavigationEntity navigationEntity);

    /**
     *  根据id获取导航栏
     * @param id  导航栏id
     * @return  导航栏对象
     */
    public NavigationEntity getNavigationEntityById(Integer id);
}
