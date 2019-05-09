package modelserver.demo.dao;

import modelserver.demo.entity.NavigationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NavigationRepository extends JpaRepository<NavigationEntity,Integer> {

     public NavigationEntity findById(Integer id);

}
