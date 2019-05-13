package modelserver.demo.service.impl;

import modelserver.demo.dao.MainINameRepository;
import modelserver.demo.entity.MainNameEntity;
import modelserver.demo.service.IMainNameService;
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
