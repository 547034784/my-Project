package com.bcpt.mockup.dao;

import com.bcpt.mockup.entity.NavigationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NavigationRepository extends JpaRepository<NavigationEntity,Integer> {

     public NavigationEntity findById(Integer id);

}
