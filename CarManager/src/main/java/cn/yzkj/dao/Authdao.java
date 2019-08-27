package cn.yzkj.dao;

import cn.yzkj.entity.Authority;
import cn.yzkj.entity.CarMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Authdao extends JpaRepository<Authority, Long> {

    List<Authority>findAll();
}
