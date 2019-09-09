package com.bcpt.mockup.controller;


import com.bcpt.mockup.entity.MainInfoEntity;
import com.bcpt.mockup.entity.MainNameEntity;
import com.bcpt.mockup.service.IMainNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *  模块描述 包括添加等操作
 * @author 杨浩
 */
@RestController
public class MainNameController {

    @Autowired
    private IMainNameService mainNameService;
    /**
     *
     * 添加模块描述
     */
    @PostMapping("/addnewmaessage")
    @ResponseBody
    public  void  addNewMessage(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id").trim());
        MainNameEntity main = new MainNameEntity();
        main.setName(request.getParameter("newmessage"));
        MainInfoEntity mainInfo = new MainInfoEntity();
        mainInfo.setId(id);
        main.setMainInfoEntity(mainInfo);
        mainNameService.addMainName(main);
    }

    /**
     *
     * 根据模块id获取所属的模块信息
     */
    @RequestMapping("/findBymainInfoEntityId")
    @ResponseBody
    public List<MainNameEntity> findByMainInfoEntityId(HttpServletRequest request){
        int mainId = Integer.parseInt(request.getParameter("id").trim());
        return  mainNameService.findByMainInfoEntityId( mainId );
    }

    /**
     *
     * 根据信息id获取所属的模块信息
     */
    @RequestMapping("/getModelMessageById")
    @ResponseBody
    public MainNameEntity getModelMessageById(HttpServletRequest request){
        int MessageId = Integer.parseInt(request.getParameter("id").trim());
        return  mainNameService.getMainNameEntityById( MessageId );
    }

    /**
     *
     * 修改模块信息
     */
    @RequestMapping("/updateModelMessage")
    @ResponseBody
    public void  updateModelMessage(HttpServletRequest request){
        int mainId = Integer.parseInt(request.getParameter("mainId"));
        Integer MessageId = Integer.parseInt( request.getParameter( "MessageId" ) );
        String MessageName = request.getParameter("MessageName");
        MainInfoEntity mainInfoEntity = new MainInfoEntity();
        mainInfoEntity.setId( mainId );
        MainNameEntity mainNameEntity = new MainNameEntity();
        mainNameEntity.setId( MessageId );
        mainNameEntity.setName( MessageName );
        mainNameEntity.setMainInfoEntity( mainInfoEntity );
        mainNameService.addMainName( mainNameEntity );
    }
}
