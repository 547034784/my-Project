package com.bcpt.mockup.controller;

import com.bcpt.mockup.entity.NavigationEntity;
import com.bcpt.mockup.service.INavigationSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 导航栏管理,导航栏的添加，修改，查询所有
 *
 * @author 杨浩
 */
@RestController
public class NavigationController {

    @Autowired
    private INavigationSevice navigation;

    /**
     * 添加导航栏
     */
    @PostMapping("/addNavigation")
    @ResponseBody
    public void addNavigation(HttpServletRequest request) {
        NavigationEntity n = new NavigationEntity();
        n.setNavigationName(request.getParameter("name"));
        navigation.addNavigation(n);
    }

    /**
     * 查询所有导航栏
     *
     * @return 所有导航栏的一个集合
     */
    @RequestMapping("/getAllnavigation")
    public List<NavigationEntity> getAllvav() {
        return navigation.getAllvavs();
    }

    /**
     * 修改导航栏名称
     */
    @PostMapping("/changeNavigation")
    public void changeNavigation(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("nav"));
        NavigationEntity n = new NavigationEntity();
        n.setNavigationName(request.getParameter("newname"));
        n.setId(id);
        navigation.updatenavigation(n);
    }

}
