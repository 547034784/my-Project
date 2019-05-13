package com.bcpt.mockup.service.impl;

import com.bcpt.mockup.dao.VersionDesRepository;
import com.bcpt.mockup.entity.VersionDesEntity;
import com.bcpt.mockup.service.IVersionDesService;
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
