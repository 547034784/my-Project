package com.bcpt.mockup.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 模块版本描述对象
 */
@Entity
@Table(name = "t_varsiondes")
public class VersionDesEntity implements Serializable {
    private static final long serialVersionUID = -5813934876927482161L;
    @Id
    @GeneratedValue
    private  Integer id;

    @Column(name = "t_des")
    private String verdes;

    @ManyToOne()
    @JsonBackReference//解决关联关系无线地柜问题
    @JoinColumn(name = "t_verid", referencedColumnName = "id")
    private VersionEntity versionEntity;

    public VersionDesEntity(){

    }

    public VersionDesEntity(String verdes, VersionEntity versionEntity) {
        this.verdes = verdes;
        this.versionEntity = versionEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVerdes() {
        return verdes;
    }

    public void setVerdes(String verdes) {
        this.verdes = verdes;
    }

    public VersionEntity getVersionEntity() {
        return versionEntity;
    }

    public void setVersionEntity(VersionEntity versionEntity) {
        this.versionEntity = versionEntity;
    }
}
