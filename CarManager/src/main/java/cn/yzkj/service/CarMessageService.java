package cn.yzkj.service;
import cn.yzkj.dao.CarMesaageRepositor;
import cn.yzkj.entity.CarMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
//车辆信息的
public class CarMessageService {
    @Autowired
    private CarMesaageRepositor carMesaageRepositor;

    public List <CarMessage> getCarMessageList() {
        List <CarMessage> carMessages = carMesaageRepositor.findAll();
        return carMessages;
    }

    @Transactional
    public void deleteCarMessageById(Integer id) {
        carMesaageRepositor.deleteByCarMessageId( id );

    }

    @Transactional
    public CarMessage UpdateCarMessage(Integer id) {

        return carMesaageRepositor.queryById( id );
    }

    @Transactional
    public CarMessage addCarMessage(CarMessage carMessage) {
        return carMesaageRepositor.save( carMessage );
    }

    @Transactional
    public void UpdateMessageById(Integer id, Integer carNumber, String carOwner, String carPlateColor, Integer motorNumber, String carBrands, String carFrame, Integer carModel, String carRegisterDate, String carType
            , String registerTime) {
        carMesaageRepositor.UpdateMessageById( id, carNumber, carOwner, carPlateColor, motorNumber, carBrands, carFrame, carModel, carRegisterDate, carType
                , registerTime );

    }
}
