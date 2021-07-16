package com.buit.cis.im.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.buit.commons.PageQuery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 类名称：ImHzry<br>
 * 类描述：住院_病人入院<br>
 * @author ZHOUHAISHENG
 */
@ApiModel(value="住院_病人入院_BaReq")
public class ImHzryBaReq extends PageQuery implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	@NotNull(message = "开始时间不能为空")
	@ApiModelProperty(value="开始时间")
	@NotNull(message = "结束时间不能为空")
    private String startDate;
	@ApiModelProperty(value="结束时间")
    private String endDate;
	@ApiModelProperty(value="病人科室 | 病人所在科室，对应GY_KSDM的代码")
    private Integer brks;
	@ApiModelProperty(value="病人病区 | 病人所在病区，对应GY_KSDM的代码")
    private Integer brbq;
	@NotNull(message = "机构id不能为空")
	@ApiModelProperty(value="机构id", hidden = true)
    private Integer jgid;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
	public Integer getJgid() {
		return jgid;
	}
	public void setJgid(Integer jgid) {
		this.jgid = jgid;
	}
	
	
	
}
