package com.bcpt.mockup.service.impl;

import com.bcpt.mockup.dao.MainInfoRepository;
import com.bcpt.mockup.entity.MainInfoEntity;
import com.bcpt.mockup.service.IMainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainInfoEntityServiceImpl implements IMainInfoService {
    @Autowired
    private MainInfoRepository main;
    @Override
    public void addNewMainInfoService(MainInfoEntity mainInfoEntity) {
           main.save(mainInfoEntity);

    }

    @Override
    public List<MainInfoEntity> getMainInfoByNavId(int id) {
        return main.findByNavigationIdOrderBySaveTimeDesc(id);
    }

    @Override
    public MainInfoEntity getMainInfoById(int id) {
        return main.findOne(id);
    }
}
