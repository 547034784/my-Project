package modelserver.demo.dao;

import modelserver.demo.entity.MainInfoEntity;
import modelserver.demo.entity.VersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VersionRepository extends JpaRepository<VersionEntity,Integer> {

    public VersionEntity getByVersionNameAndMainInfoEntityId(String name,int mainId);

    public List<VersionEntity>  findBymainInfoEntityId(int id);

}
