package com.bcpt.mockup.controller;

import com.bcpt.mockup.entity.MainInfoEntity;
import com.bcpt.mockup.entity.NavigationEntity;
import com.bcpt.mockup.service.IMainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.List;

/**
 *  模块管理，包括添加，修改，查询
 * @author  杨浩
 */
@RestController
public class MainInfoController {

    @Autowired
    private IMainInfoService mainInfoService;

    /**
     *
     * 添加模块
     */
    @PostMapping("/addmodel")
    public void addNewModel(HttpServletRequest request){
        int navId = Integer.parseInt(request.getParameter("typeid").trim());
        NavigationEntity navigationEntity = new NavigationEntity();
        navigationEntity.setId(navId);
        MainInfoEntity main = new MainInfoEntity();
        main.setNavigation(navigationEntity);
        main.setHeadName(request.getParameter("name"));
        //获取字符串类型时间
        String begin = request.getParameter("begin");
        //如果时间为空，就不设置时间
        if (begin==null || begin.equals("")){
        }
        else {
            Date date = Date.valueOf(begin);
            main.setBegingTime(date);
        }
        String end = request.getParameter("end");
        if (end==null || end.equals("")){
        }
        else {
            Date date = Date.valueOf(end);
            main.setEndTimes(date);
        }
        main.setTitleName(request.getParameter("title"));
        main.setUrl(request.getParameter("res"));
        java.util.Date date = new java.util.Date();
        //存入数据库时间，需要用它进行排序
        main.setSaveTime(date.getTime());
        mainInfoService.addNewMainInfoService(main);

    }

    /**
     *
     * 根据导航栏id获取相应的模块信息
     * @return  模块信息集合
     */
    @RequestMapping("/getmaininfobynavid")
    @ResponseBody
    public List<MainInfoEntity> getMainInfoByNavId(HttpServletRequest request){
          int mid = Integer.parseInt(request.getParameter("typeid"));
          return mainInfoService.getMainInfoByNavId(mid);
    }

    /**
     *
     * 修改模块
     */
    @PostMapping("/updateMainInfo")
    public void updateMainInfo(HttpServletRequest request){
        int nId = Integer.parseInt(request.getParameter("nid"));
        int mId = Integer.parseInt(request.getParameter("id"));
        long saveTime = Long.parseLong(request.getParameter("time"));
        NavigationEntity navigationEntity = new NavigationEntity();
        navigationEntity.setId(nId);
        MainInfoEntity mainInfoEntity = new MainInfoEntity();
        mainInfoEntity.setId(mId);
        mainInfoEntity.setNavigation(navigationEntity);
        String beginTime = request.getParameter("beginTime");

        if (beginTime==null || beginTime.equals("")){
        }
        else {
            Date date = Date.valueOf(beginTime);
            mainInfoEntity.setBegingTime(date);
        }

        String endTime = request.getParameter("endTime");
        if (endTime==null || endTime.equals("")){
        }
        else {
            Date date = Date.valueOf(endTime);
            mainInfoEntity.setEndTimes(date);
        }

        mainInfoEntity.setHeadName(request.getParameter("name"));
        mainInfoEntity.setTitleName(request.getParameter("title"));
        mainInfoEntity.setUrl(request.getParameter("res"));
        mainInfoEntity.setSaveTime(saveTime);
        mainInfoService.addNewMainInfoService(mainInfoEntity);
    }

    /**
     *
     * 根据模块id获取模块信息
     * @return  一个模块信息
     */
    @RequestMapping("getMainInfoById")
    @ResponseBody
    public MainInfoEntity getMainInfoById(HttpServletRequest request){
        int mId = Integer.parseInt(request.getParameter("id"));
        return mainInfoService.getMainInfoById(mId);
    }
}
