package com.bcpt.mockup.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 模块对象
 */
@Entity
@Table(name = "t_info")
public class MainInfoEntity implements Serializable {
    private static final long serialVersionUID = -5813934876927482161L;

    @Id
    @GeneratedValue
    private Integer id;

    //主页标题
    @Column(name = "t_headname")
    private String headName;

    //模块标题
    @Column(name = "t_titleName")
    private String titleName;

    @Column(name = "t_begin")
    private Date begingTime;

    @Column(name = "t_end")
    private Date endTimes;

    @Column(name = "t_resouce")
    private String url;

    //存入数据库的时间  按照这个时间排序渲染页面
    @Column(name = "t_save")
    private long saveTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "t_navmainid", referencedColumnName = "id")
    private NavigationEntity navigation;

    @JsonManagedReference//解决关联关系无线地柜问题
    @OneToMany(mappedBy = "mainInfoEntity", cascade = CascadeType.ALL)
    private List<MainNameEntity> mainName;

    @JsonManagedReference//解决关联关系无线地柜问题
    @OneToMany(mappedBy = "mainInfoEntity",cascade = CascadeType.ALL)
    private List<VersionEntity> versionEntityList;

   public MainInfoEntity(){

   }

    public MainInfoEntity(String headName, String titleName, Date begingTime, Date endTimes, long saveTime, NavigationEntity navigation, List<MainNameEntity> mainName, List<VersionEntity> versionEntityList, String url) {
        this.headName = headName;
        this.titleName = titleName;
        this.begingTime = begingTime;
        this.endTimes = endTimes;
        this.saveTime = saveTime;
        this.navigation = navigation;
        this.mainName = mainName;
        this.versionEntityList = versionEntityList;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public Date getBegingTime() {
        return begingTime;
    }

    public void setBegingTime(Date begingTime) {
        this.begingTime = begingTime;
    }

    public Date getEndTimes() {
        return endTimes;
    }

    public void setEndTimes(Date endTimes) {
        this.endTimes = endTimes;
    }

    public NavigationEntity getNavigation() {
        return navigation;
    }

    public void setNavigation(NavigationEntity navigation) {
        this.navigation = navigation;
    }

    public List<MainNameEntity> getMainName() {
        return mainName;
    }

    public void setMainName(List<MainNameEntity> mainName) {
        this.mainName = mainName;
    }

    public List<VersionEntity> getVersionEntityList() {
        return versionEntityList;
    }

    public void setVersionEntityList(List<VersionEntity> versionEntityList) {
        this.versionEntityList = versionEntityList;
    }

    public long getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(long saveTime) {
        this.saveTime = saveTime;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
