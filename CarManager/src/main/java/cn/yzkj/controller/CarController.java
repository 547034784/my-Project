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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@Controller
public class CarController {
    @Autowired
    private CarMessageService carMessageService;
    @Autowired
    private CarMessage carMessage;
    @RequestMapping("/login")
    public String login() {

        return "carMessage";
    }
    //默认登录页面
    @RequestMapping("/loginPage")
    public String loginPage() {

        return "loginPage";
    }
    //默认登录失败页面
    @RequestMapping("/loginError")
    public String loginError() {

        return "loginError";
    }

    //登录成功页面
    @RequestMapping("/carMessage")
    public String CarMessage(HttpServletRequest request) {
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        return "carMessage";
    }

    //查询所有车辆信息的内容
    @RequestMapping(value="carMessageList",method = RequestMethod.POST)
    @ResponseBody
    public List<CarMessage> carMessageList() {

        List <CarMessage> carMessageList = carMessageService.getCarMessageList();
        return carMessageList;
    }

    //车辆内容修改后提交
    @RequestMapping(value = "/updateCarMessageById", method = RequestMethod.POST)
    @ResponseBody
    public CarMessage UpdateCarMessageById(HttpServletRequest request) throws IOException {

        int id = Integer.parseInt( request.getParameter( "id" ) );
        int carNumber = Integer.parseInt( request.getParameter( "carNumber" ) );
        String carOwner = request.getParameter( "carOwner" );
        String carPlateColor = request.getParameter( "carPlateColor" );
        int motorNumber = Integer.parseInt( request.getParameter( "motorNumber" ) );
        String carBrands = request.getParameter( "carBrand" );
        String carFrame = request.getParameter( "carFrame" );
        int carModel = Integer.parseInt( request.getParameter( "carModel" ) );
        String carRegisterDate = request.getParameter( "carRegisterDate" );
        String carType = request.getParameter( "carType" );
        String registerTime = request.getParameter( "registerTime" );

        carMessage.setCarOwner( carOwner );
        carMessage.setCarNumber( carNumber );
        carMessage.setCarPlateColor( carPlateColor );
        carMessage.setMotorNumber( motorNumber );
        carMessage.setCarBrands( carBrands );
        carMessage.setCarFrame( carFrame );
        carMessage.setCarModel( carModel );
        carMessage.setCarRegisterDate( carRegisterDate );
        carMessage.setCarType( carType );
        carMessage.setRegisterTime( registerTime );
        carMessageService.UpdateMessageById( id, carNumber, carOwner, carPlateColor, motorNumber, carBrands, carFrame, carModel, carRegisterDate, carType
                , registerTime );
        return carMessage;
    }
    //增加车辆信息
    @RequestMapping(value = "/addCarMessage", method = RequestMethod.POST)
    @ResponseBody
    public CarMessage UpdateCarMessage(HttpServletRequest request) throws IOException {

        int carNumber = Integer.parseInt( request.getParameter( "carNumber" ) );
        String carOwner = request.getParameter( "carOwner" );
        String carPlateColor = request.getParameter( "carPlateColor" );
        int motorNumber = Integer.parseInt( request.getParameter( "motorNumber" ) );
        String carBrands = request.getParameter( "carBrand" );
        String carFrame = request.getParameter( "carFrame" );
        int carModel = Integer.parseInt( request.getParameter( "carModel" ) );
        String carRegisterDate = request.getParameter( "carRegisterDate" );
        String carType = request.getParameter( "carType" );
        String registerTime = request.getParameter( "registerTime" );

        carMessage.setCarOwner( carOwner );
        carMessage.setCarNumber( carNumber );
        carMessage.setCarPlateColor( carPlateColor );
        carMessage.setMotorNumber( motorNumber );
        carMessage.setCarBrands( carBrands );
        carMessage.setCarFrame( carFrame );
        carMessage.setCarModel( carModel );
        carMessage.setCarRegisterDate( carRegisterDate );
        carMessage.setCarType( carType );
        carMessage.setRegisterTime( registerTime );
        carMessageService.addCarMessage( this.carMessage );

        return carMessage;
    }
}
