package com.buit.cis.dctwork.response;

import java.io.Serializable;
import java.sql.Timestamp;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author yueyu
 * @Date 2020/7/20 19:24
 */
public class QuerySubmitApplyApiResp implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	@ApiModelProperty("医嘱类型")
    private Integer yzlx;
    @ApiModelProperty("项目类型")
    private Integer xmlx;
    @ApiModelProperty("提交时间")
    private Timestamp tjsj;
    @ApiModelProperty("发药方式")
    private Integer fyfs;
    @ApiModelProperty("提交病区")
    private Integer tjbq;
    @ApiModelProperty("操作工号")
    private String czgh;
    @ApiModelProperty("临时医嘱")
    private Integer lsyz;
    @ApiModelProperty("提交工号")
    private String tjgh;
    @ApiModelProperty("发药标志")
    private Integer fybz;
    @ApiModelProperty("机构id")
    private Integer jgid;
    @ApiModelProperty("提交序号")
    private Integer tjxh;

    public Integer getYzlx() {
        return yzlx;
    }

    public void setYzlx(Integer yzlx) {
        this.yzlx = yzlx;
    }

    public Integer getXmlx() {
        return xmlx;
    }

    public void setXmlx(Integer xmlx) {
        this.xmlx = xmlx;
    }

    public Timestamp getTjsj() {
        return tjsj;
    }

    public void setTjsj(Timestamp tjsj) {
        this.tjsj = tjsj;
    }

    public Integer getFyfs() {
        return fyfs;
    }

    public void setFyfs(Integer fyfs) {
        this.fyfs = fyfs;
    }

    public Integer getTjbq() {
        return tjbq;
    }

    public void setTjbq(Integer tjbq) {
        this.tjbq = tjbq;
    }

    public String getCzgh() {
        return czgh;
    }

    public void setCzgh(String czgh) {
        this.czgh = czgh;
    }

    public Integer getLsyz() {
        return lsyz;
    }

    public void setLsyz(Integer lsyz) {
        this.lsyz = lsyz;
    }

    public String getTjgh() {
        return tjgh;
    }

    public void setTjgh(String tjgh) {
        this.tjgh = tjgh;
    }

    public Integer getFybz() {
        return fybz;
    }

    public void setFybz(Integer fybz) {
        this.fybz = fybz;
    }

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public Integer getTjxh() {
        return tjxh;
    }

    public void setTjxh(Integer tjxh) {
        this.tjxh = tjxh;
    }
}
