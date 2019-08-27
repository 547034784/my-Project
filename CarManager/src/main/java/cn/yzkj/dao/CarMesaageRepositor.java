package cn.yzkj.dao;

import cn.yzkj.entity.CarMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//车辆管理
@Repository
public interface CarMesaageRepositor extends JpaRepository <CarMessage, Long> {

    //查询所有车辆
    List <CarMessage> findAll();

    //删除信息
    @Modifying
    @Query(value = "delete from CarMessage c where c.id = ?1")
    void deleteByCarMessageId(Integer id);

    //根据id查询
    @Query(value = "select c from CarMessage c where c.id = ?1")
    CarMessage queryById(Integer id);

    //添加车辆信息
    CarMessage save(CarMessage c1);

    //修改数据
    @Modifying
    @Transactional
    @Query("update CarMessage cm set cm.carNumber= ?2,cm.carOwner=?3,cm.carPlateColor=?4,cm.motorNumber=?5,cm.carBrands=?6,cm.carFrame=?7,cm.carModel=?8," +
            "cm.carRegisterDate=?9,cm.carType=?10,cm.registerTime=?11 where cm.id = ?1")
    void UpdateMessageById(Integer id, Integer carNumber, String carOwner, String carPlateColor, Integer motorNumber, String carBrands, String carFrame, Integer carModel, String carRegisterDate, String carType
            , String registerTime);
}