package com.buit.cis.im.service;


import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.buit.cis.im.request.ImFeeFymxReq;
import com.buit.cis.im.response.PatientCostResp;

/**
 * 住院费用明细服务
 * @author zhouhaisheng
 */
public interface ImFeeFymxService {

    /**
     * 批量插入
     *
     * @param insertZyfymx
     * @return
     */
    void batchInsert(@Param("list") List<ImFeeFymxReq> insertZyfymx);

    /**
     * 查询fysl之和
     *
     * @param zyh
     * @param ypxh
     * @param ypcd
     * @param jgid
     */
    BigDecimal sumFyslByZyhAndFyxhAndYpcdAndJgid(@Param("zyh") Integer zyh, @Param("ypxh") Integer ypxh, @Param("ypcd") Integer ypcd, @Param("jgid") Integer jgid);

    /**
     * 保存
      * @param imFeeFymxReq
     */
    void insert(ImFeeFymxReq imFeeFymxReq);

    /**
     *
     * @param zyh
     * @return
     */
    List<PatientCostResp> queryPatientCost(Integer zyh);

    /**
     * 批量 查询费用明细信息
     * @param ids
     * @return
     */
    List<ImFeeFymxReq> queryImFeeFymxByIds(List<Integer> ids);


}
