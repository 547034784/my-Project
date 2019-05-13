package modelserver.demo.controller;


import modelserver.demo.entity.MainInfoEntity;
import modelserver.demo.entity.VersionDesEntity;
import modelserver.demo.entity.VersionEntity;
import modelserver.demo.service.IVersionDesService;
import modelserver.demo.service.IVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.List;


/**
 *  版本管理,包括添加，修改，查询
 * @author  杨浩
 */
@RestController
//跨域设置
@CrossOrigin(origins = {"http://localhost:63342","null"})
public class VersionController {

    @Autowired
    private IVersionService versionService;

    @Autowired
    private IVersionDesService versionDesService;

    /**
     *
     * 添加新版本
     */
    @PostMapping("/savenewversion")
    public void saveNewVersion(HttpServletRequest request){
        Integer mainId = Integer.parseInt(request.getParameter("mainid").trim());
        MainInfoEntity main = new MainInfoEntity();
        main.setId(mainId);
        VersionEntity vereion = new VersionEntity();
        vereion.setVersionName(request.getParameter("name"));
        vereion.setMainInfoEntity(main);
        vereion.setUrl(request.getParameter("resouce"));
        String time = request.getParameter("time");
        if (time==null || time.equals("")){

        }
        else {
            Date date = Date.valueOf(time);
            vereion.setVersionDate(date);
        }
        versionService.addNewVersionfoService(vereion);
        vereion = versionService.getVersionByNameAndMainId(request.getParameter("name"),mainId);
        VersionDesEntity versionDesEntity = new VersionDesEntity();
        versionDesEntity.setVerdes(request.getParameter("des"));
        versionDesEntity.setVersionEntity(vereion);
        versionDesService.addVersioDes(versionDesEntity);
    }

    /**
     *
     * 根据模块id获取所属的版本信息
     * @return  版本信息集合
     */
    @RequestMapping("getVersionsByMainId")
    @ResponseBody
    public List<VersionEntity> getVerionsByMainID(HttpServletRequest request){
        int mId = Integer.parseInt(request.getParameter("id"));
        return versionService.getVersionsByMainId(mId);
    }

    /**
     *
     *  根据版本id获取版本信息
     * @return    版本信息
     */
    @RequestMapping("getVersionByVersionId")
    @ResponseBody
    public VersionEntity getVerionByVerID(HttpServletRequest request){
        int vId = Integer.parseInt(request.getParameter("id"));
        return versionService.getVersionById(vId);
    }

    /**
     *
     *   修改版本
     */
    @PostMapping("updateVersion")
    @ResponseBody
    public void updateVersion(HttpServletRequest request){
        int mainid = Integer.parseInt(request.getParameter("mainId"));
        int versionid = Integer.parseInt(request.getParameter("versionId"));
        int versionDesid = Integer.parseInt(request.getParameter("versionDesId"));
        VersionDesEntity versionDesEntity = new VersionDesEntity();
        VersionEntity versionEntity = new VersionEntity();
        MainInfoEntity mainInfoEntity = new MainInfoEntity();
        mainInfoEntity.setId(mainid);
        String versionTime = request.getParameter("versionDate");
        if (versionTime==null || versionTime.equals("")){
        }
        else {
            Date date = Date.valueOf(versionTime);
            versionEntity.setVersionDate(date);
        }
        versionEntity.setUrl(request.getParameter("versionURL"));
        versionEntity.setVersionName(request.getParameter("versionName"));
        versionEntity.setId(versionid);
        versionEntity.setMainInfoEntity(mainInfoEntity);
        //添加版本
        versionService.addNewVersionfoService(versionEntity);
        versionDesEntity.setId(versionDesid);
        versionDesEntity.setVerdes(request.getParameter("versionDesName"));
        versionDesEntity.setVersionEntity(versionEntity);
        //添加和版本向对应的版本信息
        versionDesService.addVersioDes(versionDesEntity);
    }

    /**
     *
     *   添加版本描述
     */
    @PostMapping("addNewDesMaessage")
    @ResponseBody
    public void addNewVsersionDes(HttpServletRequest request){
        int mId = Integer.parseInt(request.getParameter("verid").trim());
        VersionEntity versionEntity = new VersionEntity();
        versionEntity.setId(mId);
        VersionDesEntity versionDesEntity = new VersionDesEntity();
        versionDesEntity.setVerdes(request.getParameter("newMessage"));
        versionDesEntity.setVersionEntity(versionEntity);
        versionDesService.addVersioDes(versionDesEntity);
    }



}
