package modelserver.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "t_version")
public class VersionEntity implements Serializable {

    private static final long serialVersionUID = -5813934876927482161L;

    @Id
    @GeneratedValue
    private  Integer id;

    @Column(name = "t_vname")
    private String versionName;

    @Column(name = "t_vdate")
    private Date versionDate;

    @Column(name = "t_url")
    private String url;

    @OneToMany(mappedBy = "versionEntity", cascade = CascadeType.ALL)
    @JsonManagedReference//解决关联关系无线地柜问题
    private List<VersionDesEntity> versionDescribe;

    @ManyToOne()
    @JsonBackReference//解决关联关系无线地柜问题
    @JoinColumn(name = "t_vid",referencedColumnName = "id")
    private MainInfoEntity mainInfoEntity;

    public VersionEntity(){

    }

    public VersionEntity(String versionName, Date versionDate,List<VersionDesEntity> versionDescribe, String url, MainInfoEntity mainInfoEntity) {
        this.versionName = versionName;
        this.versionDate = versionDate;
        this.url = url;
        this.versionDescribe = versionDescribe;
        this.mainInfoEntity = mainInfoEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Date getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Date versionDate) {
        this.versionDate = versionDate;
    }

    public List<VersionDesEntity> getVersionDescribe() {
        return versionDescribe;
    }

    public void setVersionDescribe(List<VersionDesEntity> versionDescribe) {
        this.versionDescribe = versionDescribe;
    }

    public MainInfoEntity getMainInfoEntity() {
        return mainInfoEntity;
    }

    public void setMainInfoEntity(MainInfoEntity mainInfoEntity) {
        this.mainInfoEntity = mainInfoEntity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
