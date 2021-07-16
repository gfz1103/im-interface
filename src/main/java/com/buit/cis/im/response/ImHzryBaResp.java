package com.buit.cis.im.response;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import com.buit.commons.PageQuery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 类名称：ImHzry<br>
 * 类描述：住院_病人入院<br>
 * @author ZHOUHAISHENG
 */
@ApiModel(value="住院_病人入院_BaResp")
public class ImHzryBaResp extends PageQuery implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="住院号 | 该住院号为内码")
    private Integer zyh;
	@ApiModelProperty(value="住院号码")
    private String zyhm;
	@ApiModelProperty(value="病人姓名")
    private String brxm;
	@ApiModelProperty(value="出生日期")
    private Date csny;
	@ApiModelProperty(value="病人性别 DIC_GBSJ01:PD0000000260")
    private Integer brxb;
	@ApiModelProperty(value="病人科室 | 病人所在科室，对应GY_KSDM的代码")
    private Integer brks;
	@ApiModelProperty(value="病人病区 | 病人所在病区，对应GY_KSDM的代码")
    private Integer brbq;
	@ApiModelProperty(value="出院日期 | 病区办理出院证明的日期(可以提前或推后)")
    private Timestamp cyrq;
	@ApiModelProperty(value="入院日期 | 入院登记时填写的入院时间")
	private Timestamp ryrq;
	@ApiModelProperty(value="主治医生")
    private Integer zzys;
	
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
	
	
}
