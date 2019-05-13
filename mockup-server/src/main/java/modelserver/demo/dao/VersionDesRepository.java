package modelserver.demo.dao;

import modelserver.demo.entity.VersionDesEntity;
import modelserver.demo.entity.VersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VersionDesRepository extends JpaRepository<VersionDesEntity,Integer> {


}
