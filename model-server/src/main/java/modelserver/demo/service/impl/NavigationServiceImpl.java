package modelserver.demo.service.impl;

import modelserver.demo.dao.NavigationRepository;
import modelserver.demo.entity.NavigationEntity;
import modelserver.demo.service.INavigationSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavigationServiceImpl implements INavigationSevice {

    @Autowired
    private NavigationRepository navigation;
    @Override
    public void addNavigation(NavigationEntity navigationEntity) {
        navigation.save(navigationEntity);
    }

    @Override
    public List<NavigationEntity> getAllvavs() {
        return navigation.findAll();
    }

    @Override
    public void updatenavigation(NavigationEntity navigationEntity) {
        navigation.save(navigationEntity);
    }

    @Override
    public NavigationEntity getNavigationEntityById(Integer id) {
        return navigation.findById(id);
    }
}
