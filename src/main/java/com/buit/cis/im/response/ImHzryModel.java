package com.buit.cis.im.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 类名称：ImHzry<br>
 * 类描述：住院_病人入院
 * @author ZHOUHAISHENG
 * @ApiModel(value="住院_病人入院")
 */
public class ImHzryModel implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	/** 住院号 | 该住院号为内码 */
    private Integer zyh;
    /** 机构代码 */
    private Integer jgid;
    /** 病人ID */
    private Integer brid;
    /** 住院号码 | 该住院号码是在院病人的识别号，在院病人唯一 */
    private String zyhm;
    /** 病案号码 | 住院病人的病历号，病案号码唯一 */
    private String bahm;
    /** 门诊号码 */
    private String mzhm;
    /** 病人性质 | 对应PUB_BRXZ中代码 */
    private Integer brxz;
    /** 公费证号 | 若ZY_BRXZ中ZHPB为1则需填写该证号 */
    private String gfzh;
    /** 病人姓名 */
    private String brxm;
    /** 病人性别 */
    private Integer brxb;
    /** 出生年月 */
    private Timestamp csny;
    private Integer zjlx;
    /** 身份证号 */
    private String sfzh;
    /** 婚姻状况 */
    private Integer hyzk;
    /** 身份代码 | 与GY_DMZD（DMLB=14）对应 */
    private String zydm;
    /** 籍贯代码 */
    private Integer sfdm;
    /** 民族代码 */
    private Integer jgdm;
    /** 民族代码 */
    private String mzdm;
    /** 籍贯代码 */
    private String gjdm;
    /** 单位编号 | 对应与gy_cydw */
    private Integer dwbh;
    /** 工作单位 */
    private String gzdw;
    /** 单位电话 */
    private String dwdh;
    /** 单位邮编 */
    private String dwyb;
    /** 户口地址 */
    private String hkdz;
    /** 户口邮编 */
    private String hkyb;
    /** 联系人名 */
    private String lxrm;
    /** 联系人关系 | 与GY_DMZD（DMLB=4）对应 */
    private Integer lxgx;
    /** 联系地址 */
    private String lxdz;
    /** 联系电话 */
    private String lxdh;
    /** 凭证号码 */
    private String pzhm;
    /** 社保号码 | 社会保险病人社保号码 */
    private String sbhm;
    /** 担保人名 */
    private String dbrm;
    /** 担保关系 */
    private Integer dbgx;
    /** 在职退休 | 与GY_DMZD（DMLB=9）对应 */
    private Integer zztx;
    /** 大保病种 */
    private Integer dbbz;
    /** 病人科室 | 病人所在科室，对应GY_KSDM的代码 */
    private Integer brks;
    /** 病人病区 | 病人所在病区，对应GY_KSDM的代码 */
    private Integer brbq;
    /** 病人床号 */
    private String brch;
    /** 登记日期 | 填写入院登记表的时间(系统自动填写) */
    private Timestamp djrq;
    /** 入院日期 | 入院登记时填写的入院时间 */
    private Timestamp ryrq;
    /** 出院日期 | 病区办理出院证明的日期(可以提前或推后) */
    private Timestamp cyrq;
    /** 出院判别 | 0：在院病人 1：出院证明 2：预结出院 8：正常出院 9：终结出院 99 注销出院 */
    private Integer cypb;
    /** 出院方式 |与GY_DMZD（DMLB= 23）对应 1：治愈 2：好转 3：未愈 5：死亡 ：其他 */
    private Integer cyfs;
    /** 操作工号 */
    private String czgh;
    /** 入院情况 | 与GY_DMZD（DMLB=10）对应 */
    private Integer ryqk;
    /** 病人情况 | 与GY_DMZD（DMLB=10）对应 */
    private Integer brqk;
    /** 护理级别 | 0：特级护理 1：一级护理 2：二级护理 3：三级护理 */
    private Integer hljb;
    /** 饮食代码 | 与GY_DMZD（DMLB=20）对应 */
    private Integer ysdm;
    /** 病人血型 | 与GY_DMZD（DMLB=21）对应 */
    private Integer brxx;
    /** 会诊科室 */
    private Integer hzks;
    /** 借床科室 */
    private Integer jcks;
    /** 门诊医生 | 对应GY_YGDM中的YGDM的代码 */
    private String mzys;
    /** 住院医生 | 对应GY_YGDM中的YGDM的代码 */
    private String zyys;
    /** 主任医生 | 对应GY_YGDM中的YGDM的代码 */
    private String zsys;
    /** 主治医生 | 对应GY_YGDM中的YGDM的代码 */
    private String zzys;
    /** 确诊日期 | 病人确诊日期  */
    private Timestamp qzrq;
    /** 开始日期 | 床位费累加的起始日期，第一次自动累加费用后修改该时间 */
    private Timestamp ksrq;
    /** 结算日期 | 最后一次结算日期（包括作废） */
    private Timestamp jsrq;
    /** 结算次数 | 最后一次结算次数（包括作废） 下一次结算次数为当前值加1 */
    private Integer jscs;
    /** 结账日期 | 汇总日报结束时填写，若该病人已做预结则写该字段 */
    private Timestamp jzrq;
    /** 汇总日期 | 汇总日报结束时填写，病人费用、医嘱转到出院表中，根据该字段可判断病人费用、医嘱在哪张表中 */
    private Timestamp hzrq;
    /** 修改判别 | 0：没有对病人操作 1：正在对该病人费用记帐 2：正在对该病人性质转换 9：正在对该病人结算处理 该字段已经作废不使用，开始使用的版本为bshrp4.3.01.3000 */
    private Boolean xgpb;
    /** 病案判别 | 0：病人信息未转到病案系统 1：病人信息已转到病案系统 */
    private Boolean bapb;
    /** 病人关联 */
    private Integer brgl;
    /** 病人口令 */
    private String brkl;
    /** 病人全名 */
    private String brqm;
    /** 家庭电话 */
    private String jtdh;
    /** 医保卡号 */
    private String ybkh;
    /** 就诊卡号 */
    private String jzkh;
    /** 主治医生 | 指接收病人的医生，对应GY_YGDM中的YGDM的代码 */
    private String szys;
    /** 诊疗小组 | 指负责病人治疗的医疗小组，对应ZY_ZLXZ.XZXH的代码 */
    private Integer zlxz;
    /** 审批金额 | 允许病人欠款的最大金额 */
    private BigDecimal spje;
    /** 数据转移 | 0 未转移 1 已转移 */
    private Boolean sjzy;
    /** 冻结标志 | 0：未冻结      1：已冻结 */
    private Boolean djbz;
    /** 冻结ID号 | 对应ZY_ZHDJ.DJID的代码 */
    private Integer djid;
    /** 冻结金额 | 达到冻结账户的金额值 */
    private BigDecimal djje;
    /** YSJS */
    private Boolean ysjs;
    /** 转科状态 */
    private Integer zkzt;
    /** 重点患者判别 | 默认0 :不是重点患者   1:危重病人   2:手术后病人   3:新生儿病人,其高危险程度比较明显   4:疾病晚期的临终病人   5:急诊病人   6:社会上有影响有地位的人物   7:与医疗纠纷或司法案例有关的病人等 */
    private Integer zdhzpb;
    /** 备注 */
    private String bz;
    /** 出生地_省市区 */
    private Integer csdSqs;
    /** 出生地_市 */
    private Integer csdS;
    /** 出生地_县 */
    private Integer csdX;
    /** 籍贯代码_省区市 */
    private Integer jgdmSqs;
    /** 籍贯代码_市 */
    private Integer jgdmS;
    /** 籍贯代码_市 */
    private Integer xzzSqs;
    /** 现住址_市 */
    private Integer xzzS;
    /** 现住址_县 */
    private Integer xzzX;
    /** 现住址_邮编 */
    private String xzzYb;
    /** 现住址_电话 */
    private String xzzDh;
    /** 户口地址_省区市 */
    private Integer hkdzSqs;
    /** 户口地址_市 */
    private Integer hkdzS;
    /** 户口地址_县 */
    private Integer hkdzX;
    /** 现住址_其他地址 */
    private String xzzQtdz;
    /** 户口地址_其他地址 */
    private String hkdzQtdz;
    /** 调入标志 | 客户关系系统调入住院病人使用标志，1表示该病人已经导入，0则表示未导入客户关系 */
    private Integer drbz;
    /** 入院年龄 */
    private String rynl;
    /** 住院次数，用于病案归档 */
    private Integer zycs;
    /** 入院诊断 */
    private String ryzd;
    /** 目前诊断 */
    private String mqzd;
    /** 主要诊断名称 */
    private String zyzd;
    /** 门诊诊断编码 */
    private Integer mzzd;
    /** zhbz */
    private String zhbz;
    /**
     * scbz
     */
    private String scbz;
    /**
     * 农合住院登记ID
     */
    private String nhdjid;
    /**
     * 门诊类别
     */
    private Integer mzlb;
    /**
     * xzqhdm
     */
    private String xzqhdm;
    /**
     * 大病减负标志 1:尿毒症透析医疗费用,2:肾移植减负,3：精神病减负  其他：不减负
     */
    private String dbjfbz;
    /**
     * 入院途径
     */
    private Integer rytj;

    /**
     * 副主任医师
     */
    private String fzrys;
    /**
     * 责任护士
     */
    private String zrhs;
    /**
     * 主管护士
     */
    private String zghs;

    public String getFzrys() {
        return fzrys;
    }

    public void setFzrys(String fzrys) {
        this.fzrys = fzrys;
    }

    public String getZrhs() {
        return zrhs;
    }

    public void setZrhs(String zrhs) {
        this.zrhs = zrhs;
    }

    public String getZghs() {
        return zghs;
    }

    public void setZghs(String zghs) {
        this.zghs = zghs;
    }

    public Integer getZyh() {
        return zyh;
    }

    public void setZyh(Integer zyh) {
        this.zyh = zyh;
    }

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public Integer getBrid() {
        return brid;
    }

    public void setBrid(Integer brid) {
        this.brid = brid;
    }

    public String getZyhm() {
        return zyhm;
    }

    public void setZyhm(String zyhm) {
        this.zyhm = zyhm;
    }

    public String getBahm() {
        return bahm;
    }

    public void setBahm(String bahm) {
        this.bahm = bahm;
    }

    public String getMzhm() {
        return mzhm;
    }

    public void setMzhm(String mzhm) {
        this.mzhm = mzhm;
    }

    public Integer getBrxz() {
        return brxz;
    }

    public void setBrxz(Integer brxz) {
        this.brxz = brxz;
    }

    public String getGfzh() {
        return gfzh;
    }

    public void setGfzh(String gfzh) {
        this.gfzh = gfzh;
    }

    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }

    public Integer getBrxb() {
        return brxb;
    }

    public void setBrxb(Integer brxb) {
        this.brxb = brxb;
    }

    public Timestamp getCsny() {
        return csny;
    }

    public void setCsny(Timestamp csny) {
        this.csny = csny;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public Integer getHyzk() {
        return hyzk;
    }

    public void setHyzk(Integer hyzk) {
        this.hyzk = hyzk;
    }

    public String getZydm() {
        return zydm;
    }

    public void setZydm(String zydm) {
        this.zydm = zydm;
    }

    public Integer getSfdm() {
        return sfdm;
    }

    public void setSfdm(Integer sfdm) {
        this.sfdm = sfdm;
    }

    public Integer getJgdm() {
        return jgdm;
    }

    public void setJgdm(Integer jgdm) {
        this.jgdm = jgdm;
    }

    public String getMzdm() {
        return mzdm;
    }

    public void setMzdm(String mzdm) {
        this.mzdm = mzdm;
    }

    public String getGjdm() {
        return gjdm;
    }

    public void setGjdm(String gjdm) {
        this.gjdm = gjdm;
    }

    public Integer getDwbh() {
        return dwbh;
    }

    public void setDwbh(Integer dwbh) {
        this.dwbh = dwbh;
    }

    public String getGzdw() {
        return gzdw;
    }

    public void setGzdw(String gzdw) {
        this.gzdw = gzdw;
    }

    public String getDwdh() {
        return dwdh;
    }

    public void setDwdh(String dwdh) {
        this.dwdh = dwdh;
    }

    public String getDwyb() {
        return dwyb;
    }

    public void setDwyb(String dwyb) {
        this.dwyb = dwyb;
    }

    public String getHkdz() {
        return hkdz;
    }

    public void setHkdz(String hkdz) {
        this.hkdz = hkdz;
    }

    public String getHkyb() {
        return hkyb;
    }

    public void setHkyb(String hkyb) {
        this.hkyb = hkyb;
    }

    public String getLxrm() {
        return lxrm;
    }

    public void setLxrm(String lxrm) {
        this.lxrm = lxrm;
    }

    public Integer getLxgx() {
        return lxgx;
    }

    public void setLxgx(Integer lxgx) {
        this.lxgx = lxgx;
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getPzhm() {
        return pzhm;
    }

    public void setPzhm(String pzhm) {
        this.pzhm = pzhm;
    }

    public String getSbhm() {
        return sbhm;
    }

    public void setSbhm(String sbhm) {
        this.sbhm = sbhm;
    }

    public String getDbrm() {
        return dbrm;
    }

    public void setDbrm(String dbrm) {
        this.dbrm = dbrm;
    }

    public Integer getDbgx() {
        return dbgx;
    }

    public void setDbgx(Integer dbgx) {
        this.dbgx = dbgx;
    }

    public Integer getZztx() {
        return zztx;
    }

    public void setZztx(Integer zztx) {
        this.zztx = zztx;
    }

    public Integer getDbbz() {
        return dbbz;
    }

    public void setDbbz(Integer dbbz) {
        this.dbbz = dbbz;
    }

    public Integer getBrks() {
        return brks;
    }

    public void setBrks(Integer brks) {
        this.brks = brks;
    }

    public Integer getBrbq() {
        return brbq;
    }

    public void setBrbq(Integer brbq) {
        this.brbq = brbq;
    }

    public String getBrch() {
        return brch;
    }

    public void setBrch(String brch) {
        this.brch = brch;
    }

    public Timestamp getDjrq() {
        return djrq;
    }

    public void setDjrq(Timestamp djrq) {
        this.djrq = djrq;
    }

    public Timestamp getRyrq() {
        return ryrq;
    }

    public void setRyrq(Timestamp ryrq) {
        this.ryrq = ryrq;
    }

    public Timestamp getCyrq() {
        return cyrq;
    }

    public void setCyrq(Timestamp cyrq) {
        this.cyrq = cyrq;
    }

    public Integer getCypb() {
        return cypb;
    }

    public void setCypb(Integer cypb) {
        this.cypb = cypb;
    }

    public Integer getCyfs() {
        return cyfs;
    }

    public void setCyfs(Integer cyfs) {
        this.cyfs = cyfs;
    }

    public String getCzgh() {
        return czgh;
    }

    public void setCzgh(String czgh) {
        this.czgh = czgh;
    }

    public Integer getRyqk() {
        return ryqk;
    }

    public void setRyqk(Integer ryqk) {
        this.ryqk = ryqk;
    }

    public Integer getBrqk() {
        return brqk;
    }

    public void setBrqk(Integer brqk) {
        this.brqk = brqk;
    }

    public Integer getHljb() {
        return hljb;
    }

    public void setHljb(Integer hljb) {
        this.hljb = hljb;
    }

    public Integer getYsdm() {
        return ysdm;
    }

    public void setYsdm(Integer ysdm) {
        this.ysdm = ysdm;
    }

    public Integer getBrxx() {
        return brxx;
    }

    public void setBrxx(Integer brxx) {
        this.brxx = brxx;
    }

    public Integer getHzks() {
        return hzks;
    }

    public void setHzks(Integer hzks) {
        this.hzks = hzks;
    }

    public Integer getJcks() {
        return jcks;
    }

    public void setJcks(Integer jcks) {
        this.jcks = jcks;
    }

    public String getMzys() {
        return mzys;
    }

    public void setMzys(String mzys) {
        this.mzys = mzys;
    }

    public String getZyys() {
        return zyys;
    }

    public void setZyys(String zyys) {
        this.zyys = zyys;
    }

    public String getZsys() {
        return zsys;
    }

    public void setZsys(String zsys) {
        this.zsys = zsys;
    }

    public String getZzys() {
        return zzys;
    }

    public void setZzys(String zzys) {
        this.zzys = zzys;
    }

    public Timestamp getQzrq() {
        return qzrq;
    }

    public void setQzrq(Timestamp qzrq) {
        this.qzrq = qzrq;
    }

    public Timestamp getKsrq() {
        return ksrq;
    }

    public void setKsrq(Timestamp ksrq) {
        this.ksrq = ksrq;
    }

    public Timestamp getJsrq() {
        return jsrq;
    }

    public void setJsrq(Timestamp jsrq) {
        this.jsrq = jsrq;
    }

    public Integer getJscs() {
        return jscs;
    }

    public void setJscs(Integer jscs) {
        this.jscs = jscs;
    }

    public Timestamp getJzrq() {
        return jzrq;
    }

    public void setJzrq(Timestamp jzrq) {
        this.jzrq = jzrq;
    }

    public Timestamp getHzrq() {
        return hzrq;
    }

    public void setHzrq(Timestamp hzrq) {
        this.hzrq = hzrq;
    }

    public Boolean getXgpb() {
        return xgpb;
    }

    public void setXgpb(Boolean xgpb) {
        this.xgpb = xgpb;
    }

    public Boolean getBapb() {
        return bapb;
    }

    public void setBapb(Boolean bapb) {
        this.bapb = bapb;
    }

    public Integer getBrgl() {
        return brgl;
    }

    public void setBrgl(Integer brgl) {
        this.brgl = brgl;
    }

    public String getBrkl() {
        return brkl;
    }

    public void setBrkl(String brkl) {
        this.brkl = brkl;
    }

    public String getBrqm() {
        return brqm;
    }

    public void setBrqm(String brqm) {
        this.brqm = brqm;
    }

    public String getJtdh() {
        return jtdh;
    }

    public void setJtdh(String jtdh) {
        this.jtdh = jtdh;
    }

    public String getYbkh() {
        return ybkh;
    }

    public void setYbkh(String ybkh) {
        this.ybkh = ybkh;
    }

    public String getJzkh() {
        return jzkh;
    }

    public void setJzkh(String jzkh) {
        this.jzkh = jzkh;
    }

    public String getSzys() {
        return szys;
    }

    public void setSzys(String szys) {
        this.szys = szys;
    }

    public Integer getZlxz() {
        return zlxz;
    }

    public void setZlxz(Integer zlxz) {
        this.zlxz = zlxz;
    }

    public BigDecimal getSpje() {
        return spje;
    }

    public void setSpje(BigDecimal spje) {
        this.spje = spje;
    }

    public Boolean getSjzy() {
        return sjzy;
    }

    public void setSjzy(Boolean sjzy) {
        this.sjzy = sjzy;
    }

    public Boolean getDjbz() {
        return djbz;
    }

    public void setDjbz(Boolean djbz) {
        this.djbz = djbz;
    }

    public Integer getDjid() {
        return djid;
    }

    public void setDjid(Integer djid) {
        this.djid = djid;
    }

    public BigDecimal getDjje() {
        return djje;
    }

    public void setDjje(BigDecimal djje) {
        this.djje = djje;
    }

    public Boolean getYsjs() {
        return ysjs;
    }

    public void setYsjs(Boolean ysjs) {
        this.ysjs = ysjs;
    }

    public Integer getZkzt() {
        return zkzt;
    }

    public void setZkzt(Integer zkzt) {
        this.zkzt = zkzt;
    }

    public Integer getZdhzpb() {
        return zdhzpb;
    }

    public void setZdhzpb(Integer zdhzpb) {
        this.zdhzpb = zdhzpb;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getCsdSqs() {
        return csdSqs;
    }

    public void setCsdSqs(Integer csdSqs) {
        this.csdSqs = csdSqs;
    }

    public Integer getCsdS() {
        return csdS;
    }

    public void setCsdS(Integer csdS) {
        this.csdS = csdS;
    }

    public Integer getCsdX() {
        return csdX;
    }

    public void setCsdX(Integer csdX) {
        this.csdX = csdX;
    }

    public Integer getJgdmSqs() {
        return jgdmSqs;
    }

    public void setJgdmSqs(Integer jgdmSqs) {
        this.jgdmSqs = jgdmSqs;
    }

    public Integer getJgdmS() {
        return jgdmS;
    }

    public void setJgdmS(Integer jgdmS) {
        this.jgdmS = jgdmS;
    }

    public Integer getXzzSqs() {
        return xzzSqs;
    }

    public void setXzzSqs(Integer xzzSqs) {
        this.xzzSqs = xzzSqs;
    }

    public Integer getXzzS() {
        return xzzS;
    }

    public void setXzzS(Integer xzzS) {
        this.xzzS = xzzS;
    }

    public Integer getXzzX() {
        return xzzX;
    }

    public void setXzzX(Integer xzzX) {
        this.xzzX = xzzX;
    }

    public String getXzzYb() {
        return xzzYb;
    }

    public void setXzzYb(String xzzYb) {
        this.xzzYb = xzzYb;
    }

    public String getXzzDh() {
        return xzzDh;
    }

    public void setXzzDh(String xzzDh) {
        this.xzzDh = xzzDh;
    }

    public Integer getHkdzSqs() {
        return hkdzSqs;
    }

    public void setHkdzSqs(Integer hkdzSqs) {
        this.hkdzSqs = hkdzSqs;
    }

    public Integer getHkdzS() {
        return hkdzS;
    }

    public void setHkdzS(Integer hkdzS) {
        this.hkdzS = hkdzS;
    }

    public Integer getHkdzX() {
        return hkdzX;
    }

    public void setHkdzX(Integer hkdzX) {
        this.hkdzX = hkdzX;
    }

    public String getXzzQtdz() {
        return xzzQtdz;
    }

    public void setXzzQtdz(String xzzQtdz) {
        this.xzzQtdz = xzzQtdz;
    }

    public String getHkdzQtdz() {
        return hkdzQtdz;
    }

    public void setHkdzQtdz(String hkdzQtdz) {
        this.hkdzQtdz = hkdzQtdz;
    }

    public Integer getDrbz() {
        return drbz;
    }

    public void setDrbz(Integer drbz) {
        this.drbz = drbz;
    }

    public String getRynl() {
        return rynl;
    }

    public void setRynl(String rynl) {
        this.rynl = rynl;
    }

    public Integer getZycs() {
        return zycs;
    }

    public void setZycs(Integer zycs) {
        this.zycs = zycs;
    }

    public String getRyzd() {
        return ryzd;
    }

    public void setRyzd(String ryzd) {
        this.ryzd = ryzd;
    }

    public String getMqzd() {
        return mqzd;
    }

    public void setMqzd(String mqzd) {
        this.mqzd = mqzd;
    }

    public String getZyzd() {
        return zyzd;
    }

    public void setZyzd(String zyzd) {
        this.zyzd = zyzd;
    }

    public Integer getMzzd() {
        return mzzd;
    }

    public void setMzzd(Integer mzzd) {
        this.mzzd = mzzd;
    }

    public String getZhbz() {
        return zhbz;
    }

    public void setZhbz(String zhbz) {
        this.zhbz = zhbz;
    }

    public String getScbz() {
        return scbz;
    }

    public void setScbz(String scbz) {
        this.scbz = scbz;
    }

    public String getNhdjid() {
        return nhdjid;
    }

    public void setNhdjid(String nhdjid) {
        this.nhdjid = nhdjid;
    }

    public Integer getMzlb() {
        return mzlb;
    }

    public void setMzlb(Integer mzlb) {
        this.mzlb = mzlb;
    }

    public String getXzqhdm() {
        return xzqhdm;
    }

    public void setXzqhdm(String xzqhdm) {
        this.xzqhdm = xzqhdm;
    }

    public String getDbjfbz() {
        return dbjfbz;
    }

    public void setDbjfbz(String dbjfbz) {
        this.dbjfbz = dbjfbz;
    }

    public Integer getZjlx() {
        return zjlx;
    }

    public void setZjlx(Integer zjlx) {
        this.zjlx = zjlx;
    }

    public Integer getRytj() {
        return rytj;
    }

    public void setRytj(Integer rytj) {
        this.rytj = rytj;
    }
}
