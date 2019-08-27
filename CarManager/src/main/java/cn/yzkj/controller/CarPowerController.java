package cn.yzkj.controller;

import cn.yzkj.entity.Authority;
import cn.yzkj.entity.CarMessage;
import cn.yzkj.entity.Role;
import cn.yzkj.entity.User;
import cn.yzkj.service.CarMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
public class CarPowerController {
    @Autowired
    private CarMessageService carMessageService;
    @Autowired
    private CarMessage carMessage;

    //删除车辆
    @RequestMapping("/deleteCarMessage")
    public String deleteCarMessageById(Integer id,ModelMap map) {

        LeadUser leadUser = new LeadUser();
        User user = leadUser.getUserDetails();
        List <Role> roles = user.getRoles();
        for (Role role : roles) {
            List <Authority> authoritys = role.getAuthoritys();
            for (Authority authority : authoritys) {
                String authorityUrl = authority.getUrl();
                if (authorityUrl.equals( "/deleteCarMessage" )) {
                    carMessageService.deleteCarMessageById( id );
                    return "redirect:carMessage";
                }
            }
        }
        map.addAttribute( "powerMessage" ,"没有权限进行删除操作");
        return "carMessage";
    }
    //车信息的增加页面
    @RequestMapping("/carMessageAdd")
    public String carMessageAdd(ModelMap map) {

        LeadUser leadUser = new LeadUser();
        User user = leadUser.getUserDetails();
        List <Role> roles = user.getRoles();
        for (Role role : roles) {
            List <Authority> authoritys = role.getAuthoritys();
            for (Authority authority : authoritys) {
                String authorityUrl = authority.getUrl();
                if (authorityUrl.equals( "/carMessageAdd" )) {
                    return "carMessageAdd";
                }
            }
        }
        map.addAttribute( "powerMessage" ,"没有权限可以访问增加页面");
        return "carMessage";
    }
    //车辆信息内容回显
    @RequestMapping("/byIdUpdateCarMessage")
    public String ByIdUpdateCarMessage(Integer id, ModelMap map) {

        LeadUser leadUser = new LeadUser();
        User user = leadUser.getUserDetails();
        List <Role> roles = user.getRoles();
        for (Role role : roles) {
            List <Authority> authoritys = role.getAuthoritys();
            for (Authority authority : authoritys) {
                String authorityUrl = authority.getUrl();
                if (authorityUrl.equals( "/carMessageAdd" )) {
                    CarMessage carMessage = carMessageService.UpdateCarMessage( id );
                    map.addAttribute( "carMessage", carMessage );
                    return "updateCarMessage";
                }
            }
        }
        map.addAttribute( "powerMessage" ,"没有权限可以访问修改页面");
        return "carMessage";
    }
}

