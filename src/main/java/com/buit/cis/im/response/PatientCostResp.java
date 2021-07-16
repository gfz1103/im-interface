package com.buit.cis.im.response;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 住院病人费用收据查询
 * zhouhaisheng
 */
@ApiModel(value = "病案住院病人费用查询")
public class PatientCostResp implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "住院归并")
    private String zygb;
    @ApiModelProperty(value = "收费名称")
    private String sfmc;
    @ApiModelProperty(value = "总计金额")
    private BigDecimal zjje;
    @ApiModelProperty(value = "自负金额")
    private BigDecimal zfje;
    @ApiModelProperty(value = "自理金额")
    private BigDecimal zlje;

    public String getZygb() {
        return zygb;
    }

    public void setZygb(String zygb) {
        this.zygb = zygb;
    }

    public String getSfmc() {
        return sfmc;
    }

    public void setSfmc(String sfmc) {
        this.sfmc = sfmc;
    }

    public BigDecimal getZjje() {
        return zjje;
    }

    public void setZjje(BigDecimal zjje) {
        this.zjje = zjje;
    }

    public BigDecimal getZfje() {
        return zfje;
    }

    public void setZfje(BigDecimal zfje) {
        this.zfje = zfje;
    }

    public BigDecimal getZlje() {
        return zlje;
    }

    public void setZlje(BigDecimal zlje) {
        this.zlje = zlje;
    }
}
