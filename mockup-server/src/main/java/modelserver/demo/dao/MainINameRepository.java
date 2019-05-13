package modelserver.demo.dao;

import modelserver.demo.entity.MainInfoEntity;
import modelserver.demo.entity.MainNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MainINameRepository extends JpaRepository<MainNameEntity,Integer> {


}
