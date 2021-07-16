package com.buit.cis.im.response;

import com.buit.commons.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * @author songxx
 */
@ApiModel(value = "住院_病人入院_emr")
public class ImHzryEmrResp extends PageQuery implements Serializable {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "住院号 | 该住院号为内码")
    private Integer zyh;
    @ApiModelProperty(value = "住院号码")
    private String zyhm;
    @ApiModelProperty(value = "病人姓名")
    private String brxm;
    @ApiModelProperty(value = "出生日期")
    private Date csny;
    @ApiModelProperty(value = "病人性别 DIC_GBSJ01:PD0000000260")
    private Integer brxb;
    @ApiModelProperty(value = "病人科室 | 病人所在科室，对应GY_KSDM的代码")
    private Integer brks;
    @ApiModelProperty(value = "病人科室名称")
    private String brksmc;
    @ApiModelProperty(value = "病人病区 | 病人所在病区，对应GY_KSDM的代码")
    private Integer brbq;
    @ApiModelProperty(value = "病人病区名称")
    private String brbqmc;
    @ApiModelProperty(value = "出院日期 | 病区办理出院证明的日期(可以提前或推后)")
    private Timestamp cyrq;
    @ApiModelProperty(value = "入院日期 | 入院登记时填写的入院时间")
    private Timestamp ryrq;
    @ApiModelProperty(value = "住院医生")
    private Integer zyys;
    @ApiModelProperty(value = "住院医生姓名")
    private String zyysxm;
    @ApiModelProperty(value = "病人床号")
    private String brch;
    @ApiModelProperty(value = "出院方式 |与GY_DMZD（DMLB= 23）对应 1：治愈 2：好转 3：未愈 5：死亡 ：其他")
    private Integer cyfs;
    @ApiModelProperty(value = "出院方式值描述")
    private String cyfsmc;
    @ApiModelProperty(value = "病历归档状态:0未归档 1已归档")
    private Integer emrSealStatus;
    @ApiModelProperty(value = "超期时间")
    private Integer overdueTime;

    public Integer getZyh() {
        return zyh;
    }

    public void setZyh(Integer zyh) {
        this.zyh = zyh;
    }

    public String getZyhm() {
        return zyhm;
    }

    public void setZyhm(String zyhm) {
        this.zyhm = zyhm;
    }

    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }

    public Date getCsny() {
        return csny;
    }

    public void setCsny(Date csny) {
        this.csny = csny;
    }

    public Integer getBrxb() {
        return brxb;
    }

    public void setBrxb(Integer brxb) {
        this.brxb = brxb;
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

    public Timestamp getCyrq() {
        return cyrq;
    }

    public void setCyrq(Timestamp cyrq) {
        this.cyrq = cyrq;
    }

    public Timestamp getRyrq() {
        return ryrq;
    }

    public void setRyrq(Timestamp ryrq) {
        this.ryrq = ryrq;
    }

    public Integer getZyys() {
        return zyys;
    }

    public void setZyys(Integer zyys) {
        this.zyys = zyys;
    }

    public String getBrch() {
        return brch;
    }

    public void setBrch(String brch) {
        this.brch = brch;
    }

    public Integer getCyfs() {
        return cyfs;
    }

    public void setCyfs(Integer cyfs) {
        this.cyfs = cyfs;
    }

    public Integer getEmrSealStatus() {
        return emrSealStatus;
    }

    public void setEmrSealStatus(Integer emrSealStatus) {
        this.emrSealStatus = emrSealStatus;
    }

    public Integer getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(Integer overdueTime) {
        this.overdueTime = overdueTime;
    }

    public String getZyysxm() {
        return zyysxm;
    }

    public void setZyysxm(String zyysxm) {
        this.zyysxm = zyysxm;
    }

    public String getBrksmc() {
        return brksmc;
    }

    public void setBrksmc(String brksmc) {
        this.brksmc = brksmc;
    }

    public String getBrbqmc() {
        return brbqmc;
    }

    public void setBrbqmc(String brbqmc) {
        this.brbqmc = brbqmc;
    }

    public String getCyfsmc() {
        return cyfsmc;
    }

    public void setCyfsmc(String cyfsmc) {
        this.cyfsmc = cyfsmc;
    }
}
