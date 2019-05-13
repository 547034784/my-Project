package com.bcpt.mockup.service.impl;

import com.bcpt.mockup.dao.VersionRepository;
import com.bcpt.mockup.entity.VersionEntity;
import com.bcpt.mockup.service.IVersionService;
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
