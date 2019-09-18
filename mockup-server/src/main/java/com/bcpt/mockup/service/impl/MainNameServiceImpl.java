package com.bcpt.mockup.service.impl;

import com.bcpt.mockup.dao.MainINameRepository;
import com.bcpt.mockup.entity.MainInfoEntity;
import com.bcpt.mockup.entity.MainNameEntity;
import com.bcpt.mockup.service.IMainNameService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainNameServiceImpl implements IMainNameService {

    @Autowired
    private MainINameRepository mainINameRepository;

    @Override
    public void addMainName(int id, String newMessages) {
        JSONArray mess = JSONArray.fromObject( newMessages );
        for(int i = 0 ; i < mess.length() ; i++) {
            MainNameEntity main = new MainNameEntity();
            MainInfoEntity mainInfo = new MainInfoEntity();
            main.setName( (String) mess.get( i ) );
            mainInfo.setId(id);
            main.setMainInfoEntity(mainInfo);
            mainINameRepository.save(main);
        }

    }

    @Override
    public List <MainNameEntity> findByMainInfoEntityId(Integer mainId) {
        return mainINameRepository.findByMainInfoEntityId( mainId );
    }

    @Override
    public MainNameEntity getMainNameEntityById(Integer MessageId) {
        return mainINameRepository.getMainNameEntityById( MessageId );
    }

    @Override
    @Transactional
    public void deleteModelMessage(int MessageId) {
         mainINameRepository.deleteMainNameEntityById( MessageId );
    }

    @Override
    @Transactional
    public void updateMainName(MainNameEntity mainNameEntity) {
        mainINameRepository.save( mainNameEntity );
    }


}
