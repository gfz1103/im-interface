   
package com.buit.cis.dctwork.request;


import java.io.Serializable;
import java.sql.Timestamp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 类名称：CisHzyzQueryReq<br> 
 * 类描述：住院_病区医嘱列表查询<br>
 * @author GONGFANGZHOU
 */
@ApiModel(value="住院_病区医嘱_SssqApiReq")
public class CisHzyzSssqApiReq implements Serializable{
	
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="住院号(不是住院号码)")
	private Integer zyh;
	
	@ApiModelProperty(value="新增:create,修改:update")
	private String opStatus;
	
	@ApiModelProperty(value="申请单号")
	private Integer sqdh;
	
	@ApiModelProperty(value="申请日期")
	private Timestamp sqrq;
	
	@ApiModelProperty(value="手术名称")
	private String ssmc;

	public Integer getZyh() {
		return zyh;
	}

	public void setZyh(Integer zyh) {
		this.zyh = zyh;
	}
	
	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public Integer getSqdh() {
		return sqdh;
	}

	public void setSqdh(Integer sqdh) {
		this.sqdh = sqdh;
	}

	public Timestamp getSqrq() {
		return sqrq;
	}

	public void setSqrq(Timestamp sqrq) {
		this.sqrq = sqrq;
	}

	public String getSsmc() {
		return ssmc;
	}

	public void setSsmc(String ssmc) {
		this.ssmc = ssmc;
	}
	
	
}
