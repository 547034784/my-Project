package cn.yzkj.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
/**
 * Created by Administrator on 2017/9/19.
 */
@Entity
@Table(name = "role")
@Component
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(length = 25)
    private String name;
    //懒加载 不会查询role表
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List <User> users;
    //急加载 会查询role表
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private List <Authority> Authoritys;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <User> getUsers() {
        return users;
    }

    public void setUsers(List <User> users) {
        this.users = users;
    }

    public void setAuthoritys(List <Authority> authoritys) {
        Authoritys = authoritys;
    }

    public List <Authority> getAuthoritys() {
        return Authoritys;
    }
}
