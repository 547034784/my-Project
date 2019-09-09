package com.bcpt.mockup.service;

import com.bcpt.mockup.entity.MainNameEntity;

import java.util.List;

/**
 * 模块描述
 * @author  杨浩
 */
public interface IMainNameService {

    /**
     *   添加模块描述
     * @param mainNameEntity  模块描述对象
     */
    public void addMainName(MainNameEntity mainNameEntity);

    /**
     *   修改模块描述
     * @return 模块信息集合
     */
       public List<MainNameEntity> findByMainInfoEntityId(Integer MainId);

    /**
     *   修改模块描述
     * @param MessageId 模块信息id
     * @return 模块信息对象
     */
    public MainNameEntity getMainNameEntityById(Integer MessageId);

}
