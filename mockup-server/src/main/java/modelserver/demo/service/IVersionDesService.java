package modelserver.demo.service;

import modelserver.demo.entity.VersionDesEntity;
import modelserver.demo.entity.VersionEntity;

/**
 *  版本描述
 * @author  杨浩
 */
public interface IVersionDesService {
    /**
     *  添加版本描述
     * @param versionDesEntity  版本描述对象
     */
    public void addVersioDes(VersionDesEntity versionDesEntity);

}
