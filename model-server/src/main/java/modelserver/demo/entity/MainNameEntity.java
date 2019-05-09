package modelserver.demo.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_mainnames")
public class MainNameEntity implements Serializable {
    private static final long serialVersionUID = -5813934876927482161L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "t_mainname")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference//解决关联关系无线地柜问题
    @JoinColumn(name = "t_mainid", referencedColumnName = "id")
    private MainInfoEntity mainInfoEntity;

    public  MainNameEntity(){

    }

    public MainNameEntity(String name, MainInfoEntity mainInfoEntity) {
        this.name = name;
        this.mainInfoEntity = mainInfoEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainInfoEntity getMainInfoEntity() {
        return mainInfoEntity;
    }

    public void setMainInfoEntity(MainInfoEntity mainInfoEntity) {
        this.mainInfoEntity = mainInfoEntity;
    }
}
