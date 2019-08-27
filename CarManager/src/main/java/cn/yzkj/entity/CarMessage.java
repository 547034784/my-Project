package cn.yzkj.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CarMessage")
@Component("carMessage")
//车辆信息
public class CarMessage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer carNumber;//车牌号
    @Column
    private String carOwner;//车主
    @Column
    private String carPlateColor;//车牌颜色
    @Column
    private Integer motorNumber;//发动机号
    @Column
    private String carBrands;//车品牌
    @Column
    private String carFrame;//车机架
    @Column
    private Integer carModel;//车型号
    @Column
    private String carRegisterDate;//注册日期
    @Column
    private String carType;//车类型
    @Column
    private String registerTime;//初次登记时间
    @Column
    private String myphoto;//图片

    public CarMessage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarPlateColor() {
        return carPlateColor;
    }

    public void setCarPlateColor(String carPlateColor) {
        this.carPlateColor = carPlateColor;
    }

    public Integer getMotorNumber() {
        return motorNumber;
    }

    public void setMotorNumber(Integer motorNumber) {
        this.motorNumber = motorNumber;
    }

    public String getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(String carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarFrame() {
        return carFrame;
    }

    public void setCarFrame(String carFrame) {
        this.carFrame = carFrame;
    }

    public Integer getCarModel() {
        return carModel;
    }

    public void setCarModel(Integer carModel) {
        this.carModel = carModel;
    }

    public String getCarRegisterDate() {
        return carRegisterDate;
    }

    public void setCarRegisterDate(String carRegisterDate) {
        this.carRegisterDate = carRegisterDate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getMyphoto() {
        return myphoto;
    }

    public void setMyphoto(String myphoto) {
        this.myphoto = myphoto;
    }

    @Override
    public String toString() {
        return "CarMessage{" +
                "id=" + id +
                ", carNumber=" + carNumber +
                ", carOwner='" + carOwner + '\'' +
                ", carPlateColor='" + carPlateColor + '\'' +
                ", motorNumber=" + motorNumber +
                ", carBrands='" + carBrands + '\'' +
                ", carFrame='" + carFrame + '\'' +
                ", carModel=" + carModel +
                ", carRegisterDate='" + carRegisterDate + '\'' +
                ", carType='" + carType + '\'' +
                ", registerTime='" + registerTime + '\'' +
                ", myphoto='" + myphoto + '\'' +
                '}';
    }
}
