package com.buit.cis.im.service;


import java.util.List;

import com.buit.cis.im.request.ImHzryEmrReq;
import com.buit.cis.im.response.*;
import com.buit.commons.SysUser;
import org.apache.ibatis.annotations.Param;

import com.buit.cis.im.request.ImHzryBaReq;
import com.buit.cis.im.request.ImPacsPatientInfoReq;
import com.github.pagehelper.PageInfo;

/**
 * 住院病人信息
 * @author liushijie
 */
public interface ImHzryService {

    /**
     * 查询病人入院信息
     * @param zyh   住院号码
     * @param brxm  病人姓名
     * @return
     */
    List<ImHzryModel> getBrry(Integer zyh, String brxm);

    /**
     * 根据zyh查询病人住院信息
     *
     * @param zyhList
     * @return
     */
    List<ImHzryResp> queryByZyh(@Param("list") List<Integer> zyhList);

    /**
     * 根据zyh查询病人住院信息
     *
     * @param zyh
     * @return
     */
    ImHzryResp getByZyh(Integer zyh);

    /**
     * 住院号查询患者住院信息
     *
     * @param zyh
     * @return
     */
    ImHzryModel queryPatientBaseInfo(Integer zyh);
    
	/**
	 * 病案首页查询出院病人信息
	 * @Title: queryImHzryBasy
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param imHzryBaReq
	 * @param @return    设定文件
	 * @return PageInfo<ImHzryBaResp>    返回类型
	 * @author 龚方舟
	 * @throws
	 */
    PageInfo<ImHzryBaResp> queryImHzryBasyPage(ImHzryBaReq imHzryBaReq);
    
    /**
     * pacs查询病人信息
     * @Title: getHisPatientInfo
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param req
     * @param @return    设定文件
     * @return List<ImPacsPatientInfoResp>    返回类型
     * @author 龚方舟
     * @throws
     */
    List<ImPacsPatientInfoResp> getHisPatientInfo(ImPacsPatientInfoReq req);

    /**
     * 分页查询出院患者信息-电子病历归档用
     * @param req
     * @param user
     * @return
     */
    PageInfo<ImHzryEmrResp> queryImHzryEmr(ImHzryEmrReq req, SysUser user);

}
