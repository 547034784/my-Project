package com.bcpt.mockup.dao;

import com.bcpt.mockup.entity.VersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VersionRepository extends JpaRepository<VersionEntity,Integer> {

    public VersionEntity getByVersionNameAndMainInfoEntityId(String name,int mainId);

    public List<VersionEntity>  findBymainInfoEntityId(int id);

    public void delete(int id);

}
