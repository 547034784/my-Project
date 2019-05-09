package modelserver.demo.service;

import modelserver.demo.entity.MainInfoEntity;

import java.util.List;

/**
 *   模块管理
 * @author  杨浩
 */
public interface IMainInfoService {

    /**
     *  添加新模块
     * @param mainInfoEntity  模块对象
     */
    public void addNewMainInfoService(MainInfoEntity mainInfoEntity);

    /**
     *   根据导航栏id查询模块信息
     * @param id  导航栏id
     * @return  模块信息集合
     */
    public List<MainInfoEntity> getMainInfoByNavId(int id);

    /**
     *  根据模块id查询模块信息
     * @param id  模块id
     * @return  模块信息
     */
    public  MainInfoEntity getMainInfoById(int id);

}
