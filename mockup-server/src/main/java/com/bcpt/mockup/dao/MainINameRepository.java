package com.bcpt.mockup.dao;

import com.bcpt.mockup.entity.MainNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MainINameRepository extends JpaRepository<MainNameEntity,Integer> {

    public List<MainNameEntity> findByMainInfoEntityId(Integer MainId);

    public MainNameEntity getMainNameEntityById(Integer MessageId);

    public void deleteMainNameEntityById(int MessageId);
}
