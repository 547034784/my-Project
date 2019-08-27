package cn.yzkj.dao;

import cn.yzkj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//用户登录管理
@Repository
public interface SysUserRepository extends JpaRepository <User, Long> {

    public User findByUsername(String name);

}