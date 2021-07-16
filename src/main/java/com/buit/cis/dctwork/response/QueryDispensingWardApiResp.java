package com.buit.cis.dctwork.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author yueyu
 * @Date 2020/6/23 9:58
 */
@ApiModel
public class QueryDispensingWardApiResp implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("科室名称")
    private String ksmc;
    @ApiModelProperty("方式名称")
    private String fsmc;
    @ApiModelProperty("发药方式")
    private Integer fyfs;
    @ApiModelProperty("发药贴数")
    private Integer fyts;
    @ApiModelProperty("提交病区")
    private Integer tjbq;

    public String getKsmc() {
        return ksmc;
    }

    public void setKsmc(String ksmc) {
        this.ksmc = ksmc;
    }

    public String getFsmc() {
        return fsmc;
    }

    public void setFsmc(String fsmc) {
        this.fsmc = fsmc;
    }

    public Integer getFyfs() {
        return fyfs;
    }

    public void setFyfs(Integer fyfs) {
        this.fyfs = fyfs;
    }

    public Integer getFyts() {
        return fyts;
    }

    public void setFyts(Integer fyts) {
        this.fyts = fyts;
    }

    public Integer getTjbq() {
        return tjbq;
    }

    public void setTjbq(Integer tjbq) {
        this.tjbq = tjbq;
    }
}
