package com.bcpt.mockup.service.impl;

import com.bcpt.mockup.dao.MainINameRepository;
import com.bcpt.mockup.entity.MainNameEntity;
import com.bcpt.mockup.service.IMainNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MainNameServiceImpl implements IMainNameService {

    @Autowired
    private MainINameRepository mainINameRepository;

    @Override
    public void addMainName(MainNameEntity mainNameEntity) {
        mainINameRepository.save(mainNameEntity);
    }

    @Override
    public List <MainNameEntity> findByMainInfoEntityId(Integer mainId) {
        return mainINameRepository.findByMainInfoEntityId( mainId );
    }

    @Override
    public MainNameEntity getMainNameEntityById(Integer MessageId) {
        return mainINameRepository.getMainNameEntityById( MessageId );
    }


}
