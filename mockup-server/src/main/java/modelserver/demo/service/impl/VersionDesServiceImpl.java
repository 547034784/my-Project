package modelserver.demo.service.impl;

import modelserver.demo.dao.VersionDesRepository;
import modelserver.demo.entity.VersionDesEntity;
import modelserver.demo.service.IVersionDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersionDesServiceImpl implements IVersionDesService {

    @Autowired
    private VersionDesRepository versionDesRepository;
    @Override
    public void addVersioDes(VersionDesEntity versionDesEntity) {
        versionDesRepository.save(versionDesEntity);
    }
}
