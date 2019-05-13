package modelserver.demo.controller;


import modelserver.demo.entity.MainInfoEntity;
import modelserver.demo.entity.MainNameEntity;
import modelserver.demo.service.IMainNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 *    模块描述 包括添加等操作
 * @author 杨浩
 */
@RestController
@CrossOrigin(origins = {"http://localhost:63342","null"})
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
}
