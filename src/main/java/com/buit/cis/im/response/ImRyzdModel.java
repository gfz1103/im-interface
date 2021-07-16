package com.buit.cis.im.response;

import java.io.Serializable;
import java.sql.Timestamp;

import com.buit.commons.PageQuery;

import io.swagger.annotations.ApiModelProperty;

/**
 * 类名称：ImRyzd<br>
 * 类描述：住院_入院诊断
 *
 * @author ZHOUHAISHENG
 * @ApiModel(value="住院_入院诊断")
 */
public class ImRyzdModel extends PageQuery implements Serializable {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "住院号")
    private Integer zyh;
    @ApiModelProperty(value = "诊断序号 | 对应GY_JBZD的代码")
    private Integer zdxh;
    @ApiModelProperty(value = "诊断代码 | 西医ICD10,中医JBDM")
    private String zddm;
    @ApiModelProperty(value = "诊断名称")
    private String zdmc;
    @ApiModelProperty(value = "诊断类别 | 与GY_DMZD（DMLB= 22）对应 1：门诊诊断 2：入院诊断 3：出院主诊断 4：出院次诊断 5：院内感染")
    private Integer zdlb;
    @ApiModelProperty(value = "机构代码")
    private Integer jgid;
    @ApiModelProperty(value = "转归情况 | 与GY_DMZD（DMLB= 23）对应 1：治愈 2：好转 3：未愈 4：死亡 5：其他")
    private Integer zgqk;
    @ApiModelProperty(value = "提醒标志")
    private Boolean txbz;
    @ApiModelProperty(value = "scbz")
    private String scbz;
    @ApiModelProperty(value = "zdrq")
    private Timestamp zdrq;
    @ApiModelProperty(value = "入院病情代码：1.有明确诊断 2.临床未确定 3.情况不明 4.无法确定")
    private Integer rybqdm;
    @ApiModelProperty(value = "中西类别：1.西医 2.中医")
    private Integer zxlb;

    /**
     * 设置:住院号
     */
    public void setZyh(Integer value) {
        this.zyh = value;
    }

    /**
     * 获取:住院号
     */
    public Integer getZyh() {
        return zyh;
    }

    /**
     * 设置:诊断序号 | 对应GY_JBZD的代码
     */
    public void setZdxh(Integer value) {
        this.zdxh = value;
    }

    /**
     * 获取:诊断序号 | 对应GY_JBZD的代码
     */
    public Integer getZdxh() {
        return zdxh;
    }

    /**
     * 设置:诊断类别 | 与GY_DMZD（DMLB= 22）对应 1：门诊诊断 2：入院诊断 3：出院主诊断 4：出院次诊断 5：院内感染
     */
    public void setZdlb(Integer value) {
        this.zdlb = value;
    }

    /**
     * 获取:诊断类别 | 与GY_DMZD（DMLB= 22）对应 1：门诊诊断 2：入院诊断 3：出院主诊断 4：出院次诊断 5：院内感染
     */
    public Integer getZdlb() {
        return zdlb;
    }

    /**
     * 设置:机构代码
     */
    public void setJgid(Integer value) {
        this.jgid = value;
    }

    /**
     * 获取:机构代码
     */
    public Integer getJgid() {
        return jgid;
    }

    /**
     * 设置:转归情况 | 与GY_DMZD（DMLB= 23）对应 1：治愈 2：好转 3：未愈 4：死亡 5：其他
     */
    public void setZgqk(Integer value) {
        this.zgqk = value;
    }

    /**
     * 获取:转归情况 | 与GY_DMZD（DMLB= 23）对应 1：治愈 2：好转 3：未愈 4：死亡 5：其他
     */
    public Integer getZgqk() {
        return zgqk;
    }

    /**
     * 设置:提醒标志
     */
    public void setTxbz(Boolean value) {
        this.txbz = value;
    }

    /**
     * 获取:提醒标志
     */
    public Boolean getTxbz() {
        return txbz;
    }

    /**
     * 设置:scbz
     */
    public void setScbz(String value) {
        this.scbz = value;
    }

    /**
     * 获取:scbz
     */
    public String getScbz() {
        return scbz;
    }

    /**
     * 设置:zdrq
     */
    public void setZdrq(Timestamp value) {
        this.zdrq = value;
    }

    /**
     * 获取:zdrq
     */
    public Timestamp getZdrq() {
        return zdrq;
    }

    /**
     * 设置:入院病情代码：1.有明确诊断 2.临床未确定 3.情况不明 4.无法确定
     */
    public void setRybqdm(Integer value) {
        this.rybqdm = value;
    }

    /**
     * 获取:入院病情代码：1.有明确诊断 2.临床未确定 3.情况不明 4.无法确定
     */
    public Integer getRybqdm() {
        return rybqdm;
    }

    /**
     * 设置:中西类别：1.西医 2.中医
     */
    public void setZxlb(Integer value) {
        this.zxlb = value;
    }

    /**
     * 获取:中西类别：1.西医 2.中医
     */
    public Integer getZxlb() {
        return zxlb;
    }

    public String getZddm() {
        return zddm;
    }

    public void setZddm(String zddm) {
        this.zddm = zddm;
    }

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }
}
