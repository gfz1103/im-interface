package com.buit.cis.nurse.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.buit.commons.PageQuery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 类名称：NisYlxsscbd<br>
 * 类描述：压力性损伤预报、传报单
 *
 * @author GONGFANGZHOU
 */
@ApiModel(value="压力性损伤预报、传报单")
public class NisYlxsscbd extends PageQuery implements Serializable {
    @ApiModelProperty(value = "主键")
    /** 主键 */
    private Integer jlxh;
    @ApiModelProperty(value = "住院号")
    /** 住院号 */
    private Integer zyh;
    @ApiModelProperty(value = "模板类型")
    /** 模板类型 */
    private String mblx;
    @ApiModelProperty(value = "翻身情况")
    /** 翻身情况 */
    private String fsqk;
    @ApiModelProperty(value = "BMI")
    /** BMI */
    private String bmi;
    @ApiModelProperty(value = "低蛋白血症")
    /** 低蛋白血症 */
    private String ddbxz;
    @ApiModelProperty(value = "进食")
    /** 进食 */
    private String js;
    @ApiModelProperty(value = "糖尿病")
    /** 糖尿病 */
    private String tlb;
    @ApiModelProperty(value = "评估者")
    /** 评估者 */
    private String pgz;
    @ApiModelProperty(value = "日期")
    /** 日期 */
    private Timestamp rq;
    @ApiModelProperty(value = "机构id")
    /** 机构id */
    private Integer jgid;
    @ApiModelProperty(value = "报告日期")
    /** 报告日期 */
    private Timestamp bgsj;
    @ApiModelProperty(value = "手术时间")
    /** 手术时间 */
    private String sssj;
    @ApiModelProperty(value = "手术中舒张压")
    /** 手术中舒张压 */
    private String ssszy;

    /**
     * 设置:主键
     */
    public void setJlxh(Integer value) {
        this.jlxh = value;
    }

    /**
     * 获取:主键
     */
    public Integer getJlxh() {
        return jlxh;
    }

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
     * 设置:模板类型
     */
    public void setMblx(String value) {
        this.mblx = value;
    }

    /**
     * 获取:模板类型
     */
    public String getMblx() {
        return mblx;
    }

    /**
     * 设置:翻身情况
     */
    public void setFsqk(String value) {
        this.fsqk = value;
    }

    /**
     * 获取:翻身情况
     */
    public String getFsqk() {
        return fsqk;
    }

    /**
     * 设置:BMI
     */
    public void setBmi(String value) {
        this.bmi = value;
    }

    /**
     * 获取:BMI
     */
    public String getBmi() {
        return bmi;
    }

    /**
     * 设置:低蛋白血症
     */
    public void setDdbxz(String value) {
        this.ddbxz = value;
    }

    /**
     * 获取:低蛋白血症
     */
    public String getDdbxz() {
        return ddbxz;
    }

    /**
     * 设置:进食
     */
    public void setJs(String value) {
        this.js = value;
    }

    /**
     * 获取:进食
     */
    public String getJs() {
        return js;
    }

    /**
     * 设置:糖尿病
     */
    public void setTlb(String value) {
        this.tlb = value;
    }

    /**
     * 获取:糖尿病
     */
    public String getTlb() {
        return tlb;
    }

    /**
     * 设置:评估者
     */
    public void setPgz(String value) {
        this.pgz = value;
    }

    /**
     * 获取:评估者
     */
    public String getPgz() {
        return pgz;
    }

    /**
     * 设置:日期
     */
    public void setRq(Timestamp value) {
        this.rq = value;
    }

    /**
     * 获取:日期
     */
    public Timestamp getRq() {
        return rq;
    }

    /**
     * 设置:机构id
     */
    public void setJgid(Integer value) {
        this.jgid = value;
    }

    /**
     * 获取:机构id
     */
    public Integer getJgid() {
        return jgid;
    }

    /**
     * 设置:报告日期
     */
    public void setBgsj(Timestamp value) {
        this.bgsj = value;
    }

    /**
     * 获取:报告日期
     */
    public Timestamp getBgsj() {
        return bgsj;
    }

    /**
     * 设置:手术日期
     */
    public void setSssj(String sssj) {
        this.sssj = sssj;
    }

    /**
     * 获取:手术日期
     */
    public String getSssj() {
        return sssj;
    }

    /**
     * 设置:手术中舒张压
     */
    public void setSsszy(String ssszy) {
        this.ssszy = ssszy;
    }

    /**
     * 获取:手术中舒张压
     */
    public String getSsszy() {
        return ssszy;
    }

}