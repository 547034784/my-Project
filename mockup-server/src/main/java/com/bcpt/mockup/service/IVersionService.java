package com.bcpt.mockup.service;

import com.bcpt.mockup.entity.VersionEntity;
import java.util.List;

/**
 * 版本管理
 * @author  杨浩
 */
public interface IVersionService {

    /**
     *  添加版本
     * @param versionEntity  版本对象
     */
    public void addNewVersionfoService(VersionEntity versionEntity);

    /**
     * 根据版本名称和模块id获取版本信息
     * @param name  版本名称
     * @param mainId  模块id
     * @return  版本对象
     */
    public VersionEntity getVersionByNameAndMainId(String name,int mainId);

    /**
     * 根据模块id 获取所对应的版本信息
     * @param mainId  模块id
     * @return 版本信息集合
     */
    public List<VersionEntity> getVersionsByMainId(int mainId);

    /**
     * 根据版本id 获取版本信息
     * @param id  版本id
     * @return 版本对象
     */
    public VersionEntity getVersionById(int id);
}
