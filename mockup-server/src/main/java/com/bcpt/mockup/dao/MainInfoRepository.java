package com.bcpt.mockup.dao;

import com.bcpt.mockup.entity.MainInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MainInfoRepository extends JpaRepository<MainInfoEntity,Integer> {

   public List<MainInfoEntity> findByNavigationIdOrderBySaveTimeDesc(int id);

}
