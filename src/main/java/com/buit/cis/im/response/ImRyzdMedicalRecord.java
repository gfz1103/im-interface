package com.buit.cis.im.response;

import java.io.Serializable;

import com.buit.commons.PageQuery;

import io.swagger.annotations.ApiModelProperty;

/**
 * 类名称：ImRyzd<br>
 * 类描述：住院_入院诊断
 *
 * @author ZHOUHAISHENG
 * @ApiModel(value="住院_入院诊断")
 */
public class ImRyzdMedicalRecord extends PageQuery implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "住院号")
    private Integer zyh;
    @ApiModelProperty(value = "诊断序号 | 对应GY_JBZD的代码")
    private Integer zdxh;
    @ApiModelProperty(value = "诊断类别 | 与GY_DMZD（DMLB= 22）对应 1：门诊诊断 2：入院诊断 3：出院主诊断 4：出院次诊断 5：院内感染")
    private Integer zdlb;
    @ApiModelProperty(value = "机构代码")
    private Integer jgid;
    @ApiModelProperty(value = "入院病情代码：1.有明确诊断 2.临床未确定 3.情况不明 4.无法确定")
    private Integer rybqdm;
    @ApiModelProperty(value = "中西类别：1.西医 2.中医")
    private Integer zxlb;
    @ApiModelProperty(value = "疾病名称")
    private String jbmc;
    @ApiModelProperty(value = "中西类别：1.西医 2.中医")
	private String icd_code;
	@ApiModelProperty(value = "出院情况 1治愈 2好转 3未愈 4死亡 5其他")
	private Integer cyqk;

	public Integer getCyqk() {
		return cyqk;
	}

	public void setCyqk(Integer cyqk) {
		this.cyqk = cyqk;
	}

	public Integer getZyh() {
		return zyh;
	}

	public void setZyh(Integer zyh) {
		this.zyh = zyh;
	}

	public Integer getZdxh() {
		return zdxh;
	}

	public void setZdxh(Integer zdxh) {
		this.zdxh = zdxh;
	}

	public Integer getZdlb() {
		return zdlb;
	}

	public void setZdlb(Integer zdlb) {
		this.zdlb = zdlb;
	}

	public Integer getJgid() {
		return jgid;
	}

	public void setJgid(Integer jgid) {
		this.jgid = jgid;
	}

	public Integer getRybqdm() {
		return rybqdm;
	}

	public void setRybqdm(Integer rybqdm) {
		this.rybqdm = rybqdm;
	}

	public Integer getZxlb() {
		return zxlb;
	}

	public void setZxlb(Integer zxlb) {
		this.zxlb = zxlb;
	}

	public String getJbmc() {
		return jbmc;
	}

	public void setJbmc(String jbmc) {
		this.jbmc = jbmc;
	}

	public String getIcd_code() {
		return icd_code;
	}

	public void setIcd_code(String icd_code) {
		this.icd_code = icd_code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
