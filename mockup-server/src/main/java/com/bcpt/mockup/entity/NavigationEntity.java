package com.bcpt.mockup.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 导航栏对象
 */
@Entity
@Table(name = "t_navigation")
public class NavigationEntity implements Serializable {
    private static final long serialVersionUID = -5813934876927482161L;
    @Id
    @GeneratedValue
    private  Integer id;

    @Column(name = "t_name")
    private String navigationName;

    @OneToMany()
    private List<MainInfoEntity> mainInfoEntity;

    public NavigationEntity(String navigationName, List<MainInfoEntity> mainInfoEntity) {
        this.navigationName = navigationName;
        this.mainInfoEntity = mainInfoEntity;
    }

    public NavigationEntity(){ }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

    public List<MainInfoEntity> getMainInfoEntity() {
        return mainInfoEntity;
    }

    public void setMainInfoEntity(List<MainInfoEntity> mainInfoEntity) {
        this.mainInfoEntity = mainInfoEntity;
    }
}
