package com.buit.cis.dctwork.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author yueyu
 * @Date 2020/6/29 19:06
 */
@ApiModel
public class QueryBackMedicineWardApiResp implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("科室名称")
    private String ksmc;
    @ApiModelProperty("退药贴数")
    private Integer tyts;
    @ApiModelProperty("退药病区")
    private Integer tybq;

    public String getKsmc() {
        return ksmc;
    }

    public void setKsmc(String ksmc) {
        this.ksmc = ksmc;
    }

    public Integer getTyts() {
        return tyts;
    }

    public void setTyts(Integer tyts) {
        this.tyts = tyts;
    }

    public Integer getTybq() {
        return tybq;
    }

    public void setTybq(Integer tybq) {
        this.tybq = tybq;
    }
}
