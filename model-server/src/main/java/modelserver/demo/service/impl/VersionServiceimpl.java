package modelserver.demo.service.impl;

import modelserver.demo.dao.VersionRepository;
import modelserver.demo.entity.VersionEntity;
import modelserver.demo.service.IVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VersionServiceimpl implements IVersionService {

    @Autowired
    private VersionRepository versionRepository;

    @Override
    public void addNewVersionfoService(VersionEntity versionEntity) {
        versionRepository.save(versionEntity);
    }

    @Override
    public VersionEntity getVersionByNameAndMainId(String name,int mainId) {
        return versionRepository.getByVersionNameAndMainInfoEntityId(name,mainId);
    }

    @Override
    public List<VersionEntity> getVersionsByMainId(int mainId) {
        return versionRepository.findBymainInfoEntityId(mainId);
    }

    @Override
    public VersionEntity getVersionById(int id) {
        return versionRepository.findOne(id);
    }
}
