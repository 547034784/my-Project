package com.bcpt.mockup.service.impl;

import com.bcpt.mockup.dao.MainINameRepository;
import com.bcpt.mockup.entity.MainNameEntity;
import com.bcpt.mockup.service.IMainNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainNameServiceImpl implements IMainNameService {

    @Autowired
    private MainINameRepository mainINameRepository;
    @Override
    public void addMainName(MainNameEntity mainNameEntity) {
        mainINameRepository.save(mainNameEntity);
    }
}
