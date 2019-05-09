package modelserver.demo.dao;

import modelserver.demo.entity.MainInfoEntity;
import modelserver.demo.entity.NavigationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MainInfoRepository extends JpaRepository<MainInfoEntity,Integer> {

   public List<MainInfoEntity> findByNavigationIdOrderBySaveTimeDesc(int id);



}
