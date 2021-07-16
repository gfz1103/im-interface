package com.buit.cis.im.service;

import java.util.List;

import com.buit.cis.im.response.ImRyzdMedicalRecord;
import com.buit.cis.im.response.ImRyzdModel;

/**
 * 类名：ImRyzdService
 * 描述：住院入院诊断接口
 *
 * @author : liushijie
 * 2020/9/15
 **/
public interface ImRyzdService {

    /**
     * 查询入院诊断
     * @param zyh
     * @return
     */
    ImRyzdModel queryRyzd(Integer zyh);

    /**
     * 根据住院号查询诊断名称
     * @param zyh
     * @return
     */
    List<String> queryZdmcByZyh(String zyh);
    
    /**
     * 查询住院病人病案首页诊断信息
     * @Title: queryZdInfoMedicalRecord
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param zyh
     * @param @return    设定文件
     * @return List<ImRyzdMedicalRecord>    返回类型
     * @author 龚方舟
     * @throws
     */
    List<ImRyzdMedicalRecord> queryZdInfoMedicalRecord(Integer zyh);
    
    /**
     * 查询对应类别的所有诊断（包含中医和西医）
     *
     * @param zyh  住院号
     * @param zdlb 诊断类别
     */
    List<ImRyzdModel> findList(Integer zyh, Integer zdlb);

}
