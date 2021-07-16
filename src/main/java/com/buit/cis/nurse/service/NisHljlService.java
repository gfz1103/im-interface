package com.buit.cis.nurse.service;

import com.buit.cis.nurse.model.NisAllzxd;
import com.buit.cis.nurse.model.NisBqyjpgd;
import com.buit.cis.nurse.model.NisChhld;
import com.buit.cis.nurse.model.NisCqhld;
import com.buit.cis.nurse.model.NisDdzcpgb;
import com.buit.cis.nurse.model.NisFsspgb;
import com.buit.cis.nurse.model.NisFssrisk;
import com.buit.cis.nurse.model.NisFyfxpgd;
import com.buit.cis.nurse.model.NisGdhtwxysb;
import com.buit.cis.nurse.model.NisHljl;
import com.buit.cis.nurse.model.NisHljlmb;
import com.buit.cis.nurse.model.NisLzdngpgb;
import com.buit.cis.nurse.model.NisRyhld;
import com.buit.cis.nurse.model.NisSjkjld;
import com.buit.cis.nurse.model.NisWzhld;
import com.buit.cis.nurse.model.NisYcwxpgb;
import com.buit.cis.nurse.model.NisZspdl;
import com.buit.cis.nurse.model.NisZxjmpgb;
import com.buit.commons.PageQuery;
import com.github.pagehelper.PageInfo;


/**
 * 护理记录interface
 *
 * @author 龚方舟
 * @ClassName: NisHljlService
 * @date 2020年10月12日 下午5:15:28
 */
public interface NisHljlService {
    /**
     * 查询护理记录模版
     *
     * @return
     */
    PageInfo<NisHljlmb> queryHljlmbList(PageQuery page);

    /**
     * 查询一般护理记录
     *
     * @param zyh 住院号
     * @return
     */
    PageInfo<NisHljl> queryHljl(Integer zyh, PageQuery page);

    /**
     * 查询危重患者护理单
     *
     * @param zyh 住院号
     * @return
     */
    PageInfo<NisWzhld> queryWzhld(Integer zyh, PageQuery page);


    /**
     * 查询患者病情预警评估单
     *
     * @param zyh 住院号
     * @return
     */
    PageInfo<NisBqyjpgd> queryBqyjpgd(Integer zyh, PageQuery page);


    /**
     * 查询Barthel指数平定量表
     *
     * @param zyh 住院号
     * @return
     */
    PageInfo<NisZspdl> queryZspdl(Integer zyh, PageQuery page);

    /**
     * 查询产前护理记录单
     *
     * @param zyh
     * @return
     */
    PageInfo<NisCqhld> queryCqhld(Integer zyh, PageQuery page);

    /**
     * 查询产后护理记录单
     *
     * @param zyh
     * @return
     */
    PageInfo<NisChhld> queryChhld(Integer zyh, PageQuery page);

    /**
     * 查询住院患者压疮危险因素评估表
     *
     * @param zyh
     * @return
     */
    PageInfo<NisYcwxpgb> queryYcwxpgb(Integer zyh, PageQuery page);

    /**
     * 查询医院获得性肺炎风险因素评估单
     *
     * @param zyh
     * @return
     */
    PageInfo<NisFyfxpgd> queryFyfxpgd(Integer zyh, PageQuery page);


    /**
     * 查询住院患者管道滑脱危险因素评估表
     * @param zyh
     * @return
     */
    PageInfo<NisGdhtwxysb> queryGdhtwxysb(Integer zyh, PageQuery page);

    /**
     * 查询住院患者跌倒、坠床危险因素评估表
     * @param zyh
     * @return
     */
    PageInfo<NisDdzcpgb> queryDdzcpgb(Integer zyh, PageQuery page);

    /**
     * 查询留置导尿管感染风险因素评估表
     * @param zyh
     * @return
     */
    PageInfo<NisLzdngpgb> queryLzdngpgb(Integer zyh, PageQuery page);

    /**
     * 查询中心静脉导管相关性感染风险因素评估表
     * @param zyh
     * @return
     */
    PageInfo<NisZxjmpgb> queryZxjmpgb(Integer zyh, PageQuery page);

    /**
     * 查询肺栓塞风险因素评估表
     * @param zyh
     * @return
     */
    PageInfo<NisFssrisk> queryFssrisk(Integer zyh, PageQuery page);

    /**
     * 查询入院护理评估单
     * @param zyh
     * @return
     */
    PageInfo<NisRyhld> queryRyhld(Integer zyh, PageQuery page);

    /**
     * 查询深静脉血栓风险评估表
     * @param zyh
     * @return
     */
    PageInfo<NisFsspgb> queryFsspgb(Integer zyh, PageQuery page);

    /**
     * 查询神经科记录单
     * @param zyh
     * @return
     */
    PageInfo<NisSjkjld> querySjkjld(Integer zyh, PageQuery page);

    /**
     * 查询所有护理执行单
     * @param zyh
     * @return
     */
    PageInfo<NisAllzxd> queryAllzxd(Integer zyh, String mblx, PageQuery page);


}
