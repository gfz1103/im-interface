
package com.buit.cis.dctwork.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.buit.commons.PageQuery;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 类名称：CisHzyzQueryResp<br>
 * 类描述：住院_病区发药明细<br>
 *
 * @author GONGFANGZHOU
 */
@ApiModel(value = "住院_病区发药明细_queryResp")
public class CisHzyzQueryResp extends PageQuery implements Serializable {

    @ApiModelProperty(value = "医嘱作废,暂时只有医嘱本打印有用")
    private Integer yzzf;

    @ApiModelProperty(value = "申请文号")
    private Integer sqwh;

    @ApiModelProperty(value = "自备药标识")
    private Integer zfyp;

    @ApiModelProperty(value = "自备药标识")
    private Integer zby;

    @ApiModelProperty(value = "药房单位")
    private String yfdw;

    @ApiModelProperty(value = "药品剂量")
    private BigDecimal ypjl;

    @ApiModelProperty(value = "剂量单位")
    private String jldw;

    @ApiModelProperty(value = "记录序号")
    private Integer jlxh;

    @ApiModelProperty(value = "机构id")
    private Integer jgid;

    @ApiModelProperty(value = "住院号")
    private Integer zyh;

    @ApiModelProperty(value = "药品序号")
    private Integer ypxh;

    @ApiModelProperty(value = "医嘱组好")
    private Integer yzzh;

    @ApiModelProperty(value = "药房包装")
    private Integer yfbz;

    @ApiModelProperty(value = "处方贴数")
    private Integer cfts;

    @ApiModelProperty(value = "煎法")
    private Integer ypzs;

    @ApiModelProperty(value = "脚注")
    private Integer jz;

    @ApiModelProperty(value = "开始时间")
    private Timestamp kssj;

    @ApiModelProperty(value = "医嘱名称")
    private String yzmc;

    @ApiModelProperty(value = "一次剂量")
    private BigDecimal ycjl;

    @ApiModelProperty(value = "一次数量")
    private BigDecimal ycsl;

    @ApiModelProperty(value = "使用频次")
    private String sypc;

    @ApiModelProperty(value = "每日次数")
    private Integer mrcs;

    @ApiModelProperty(value = "医嘱执行时间")
    private String yzzxsj;

    @ApiModelProperty(value = "首日次数")
    private Integer srcs;

    @ApiModelProperty(value = "药品用法")
    private Integer ypyf;

    @ApiModelProperty(value = "药品单价")
    private BigDecimal ypdj;

    @ApiModelProperty(value = "医生工号")
    private String ysgh;

    @ApiModelProperty(value = "复核工号")
    private String fhgh;

    @ApiModelProperty(value = "停嘱时间")
    private Timestamp tzsj;

    @ApiModelProperty(value = "确认时间")
    private Timestamp qrsj;

    @ApiModelProperty(value = "药房规格")
    private String yfgg;

    @ApiModelProperty(value = "停嘱医生")
    private String tzys;

    @ApiModelProperty(value = "发药方式")
    private Integer fyfs;

    @ApiModelProperty(value = "备注信息")
    private String bzxx;

    @ApiModelProperty(value = "药品产地")
    private Integer ypcd;

    @ApiModelProperty(value = "药房识别")
    private Integer yfsb;

    @ApiModelProperty(value = "操作工号")
    private String czgh;

    @ApiModelProperty(value = "作废判别")
    private Integer zfpb;

    @ApiModelProperty(value = "药品类型")
    private Integer yplx;

    @ApiModelProperty(value = "使用标志")
    private Integer sybz;

    @ApiModelProperty(value = "每周次数")
    private Integer mzcs;

    @ApiModelProperty(value = "医技主项")
    private Integer yjzx;

    @ApiModelProperty(value = "执行科室")
    private Integer zxks;

    @ApiModelProperty(value = "医技序号")
    private Integer yjxh;

    @ApiModelProperty(value = "项目类型")
    private Integer xmlx;

    @ApiModelProperty(value = "计费标志")
    private Integer jfbz;

    @ApiModelProperty(value = "作废标志")
    private Integer zfbz;

    @ApiModelProperty(value = "审方结果")
    private Integer sfjg;

    @ApiModelProperty(value = "复核标志")
    private Integer fhbz;

    @ApiModelProperty(value = "停嘱复核标志")
    private Integer tzfhbz;

    @ApiModelProperty(value = "皮试判别")
    private Integer pspb;

    @ApiModelProperty(value = "医嘱判别")
    private Integer yzpb;

    @ApiModelProperty(value = "历史标志")
    private Integer lsbz;

    @ApiModelProperty(value = "婴儿判别")
    private Integer yepb;

    @ApiModelProperty(value = "发药属性")
    private Integer fysx;

    @ApiModelProperty(value = "医生医嘱标志")
    private Integer ysbz;

    @ApiModelProperty(value = "医生提交标志")
    private Integer ystj;

    @ApiModelProperty(value = "临时医嘱")
    private Integer lsyz;

    @ApiModelProperty(value = "补充业务id")
    private Integer ywid;

    @ApiModelProperty(value = "用药天数")
    private Integer yyts;

    @ApiModelProperty(value = "作废工号")
    private String zfgh;

    @ApiModelProperty(value = "组套标志")
    private Integer ztbz;

    @ApiModelProperty(value = "组套医嘱记录序号")
    private Integer ztyzjlxh;

    @ApiModelProperty(value = "医嘱类型(0:检查1:检验2:备血3:手术4:会诊5:住院处方6:理疗)")
    private Integer yzlx;

    @ApiModelProperty(value = "皮试结果")
    private Integer psjg;

    @ApiModelProperty(value = "医嘱排序")
    private Integer yzpx;

    @ApiModelProperty(value = "申请id")
    private Integer sqid;

    @ApiModelProperty(value = "TPN")
    private Integer tpn;

    @ApiModelProperty(value = "产地名称")
    private String cdmc;

    @ApiModelProperty(value = "抗菌药物审批")
    private Integer kjywsp;
    
    @ApiModelProperty(value = "滴速")
    private String ds;
    
    @ApiModelProperty(value = "复核时间")
    private Timestamp fhsj;

    @ApiModelProperty(value="组套一次剂量")
    private BigDecimal ztycjl;

    @ApiModelProperty(value="组套每日次数")
    private Integer ztmrcs;

    @ApiModelProperty(value="组套一次数量")
    private BigDecimal ztycsl;
    
    @ApiModelProperty(value="过敏药物类别")
    private Integer gmywlb;
    
    public Integer getYzzf() {
        return yzzf;
    }

    public void setYzzf(Integer yzzf) {
        this.yzzf = yzzf;
    }

    public Integer getSqwh() {
        return sqwh;
    }

    public void setSqwh(Integer sqwh) {
        this.sqwh = sqwh;
    }

    public Integer getZfyp() {
        return zfyp;
    }

    public void setZfyp(Integer zfyp) {
        this.zfyp = zfyp;
    }

    public Integer getZby() {
        return zby;
    }

    public void setZby(Integer zby) {
        this.zby = zby;
    }

    public String getYfdw() {
        return yfdw;
    }

    public void setYfdw(String yfdw) {
        this.yfdw = yfdw;
    }

    public BigDecimal getYpjl() {
        return ypjl;
    }

    public void setYpjl(BigDecimal ypjl) {
        this.ypjl = ypjl;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public Integer getJlxh() {
        return jlxh;
    }

    public void setJlxh(Integer jlxh) {
        this.jlxh = jlxh;
    }

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public Integer getZyh() {
        return zyh;
    }

    public void setZyh(Integer zyh) {
        this.zyh = zyh;
    }

    public Integer getYpxh() {
        return ypxh;
    }

    public void setYpxh(Integer ypxh) {
        this.ypxh = ypxh;
    }

    public Integer getYzzh() {
        return yzzh;
    }

    public void setYzzh(Integer yzzh) {
        this.yzzh = yzzh;
    }

    public Integer getYfbz() {
        return yfbz;
    }

    public void setYfbz(Integer yfbz) {
        this.yfbz = yfbz;
    }

    public Integer getCfts() {
        return cfts;
    }

    public void setCfts(Integer cfts) {
        this.cfts = cfts;
    }

    public Integer getYpzs() {
        return ypzs;
    }

    public void setYpzs(Integer ypzs) {
        this.ypzs = ypzs;
    }

    public Integer getJz() {
        return jz;
    }

    public void setJz(Integer jz) {
        this.jz = jz;
    }

    public Timestamp getKssj() {
        return kssj;
    }

    public void setKssj(Timestamp kssj) {
        this.kssj = kssj;
    }

    public String getYzmc() {
        return yzmc;
    }

    public void setYzmc(String yzmc) {
        this.yzmc = yzmc;
    }

    public BigDecimal getYcjl() {
        return ycjl;
    }

    public void setYcjl(BigDecimal ycjl) {
        this.ycjl = ycjl;
    }

    public BigDecimal getYcsl() {
        return ycsl;
    }

    public void setYcsl(BigDecimal ycsl) {
        this.ycsl = ycsl;
    }

    public String getSypc() {
        return sypc;
    }

    public void setSypc(String sypc) {
        this.sypc = sypc;
    }

    public Integer getMrcs() {
        return mrcs;
    }

    public void setMrcs(Integer mrcs) {
        this.mrcs = mrcs;
    }

    public String getYzzxsj() {
        return yzzxsj;
    }

    public void setYzzxsj(String yzzxsj) {
        this.yzzxsj = yzzxsj;
    }

    public Integer getSrcs() {
        return srcs;
    }

    public void setSrcs(Integer srcs) {
        this.srcs = srcs;
    }

    public Integer getYpyf() {
        return ypyf;
    }

    public void setYpyf(Integer ypyf) {
        this.ypyf = ypyf;
    }

    public BigDecimal getYpdj() {
        return ypdj;
    }

    public void setYpdj(BigDecimal ypdj) {
        this.ypdj = ypdj;
    }

    public String getYsgh() {
        return ysgh;
    }

    public void setYsgh(String ysgh) {
        this.ysgh = ysgh;
    }

    public String getFhgh() {
        return fhgh;
    }

    public void setFhgh(String fhgh) {
        this.fhgh = fhgh;
    }

    public Timestamp getTzsj() {
        return tzsj;
    }

    public void setTzsj(Timestamp tzsj) {
        this.tzsj = tzsj;
    }

    public Timestamp getQrsj() {
        return qrsj;
    }

    public void setQrsj(Timestamp qrsj) {
        this.qrsj = qrsj;
    }

    public String getYfgg() {
        return yfgg;
    }

    public void setYfgg(String yfgg) {
        this.yfgg = yfgg;
    }

    public String getTzys() {
        return tzys;
    }

    public void setTzys(String tzys) {
        this.tzys = tzys;
    }

    public Integer getFyfs() {
        return fyfs;
    }

    public void setFyfs(Integer fyfs) {
        this.fyfs = fyfs;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
    }

    public Integer getYpcd() {
        return ypcd;
    }

    public void setYpcd(Integer ypcd) {
        this.ypcd = ypcd;
    }

    public Integer getYfsb() {
        return yfsb;
    }

    public void setYfsb(Integer yfsb) {
        this.yfsb = yfsb;
    }

    public String getCzgh() {
        return czgh;
    }

    public void setCzgh(String czgh) {
        this.czgh = czgh;
    }

    public Integer getZfpb() {
        return zfpb;
    }

    public void setZfpb(Integer zfpb) {
        this.zfpb = zfpb;
    }

    public Integer getYplx() {
        return yplx;
    }

    public void setYplx(Integer yplx) {
        this.yplx = yplx;
    }

    public Integer getSybz() {
        return sybz;
    }

    public void setSybz(Integer sybz) {
        this.sybz = sybz;
    }

    public Integer getMzcs() {
        return mzcs;
    }

    public void setMzcs(Integer mzcs) {
        this.mzcs = mzcs;
    }

    public Integer getYjzx() {
        return yjzx;
    }

    public void setYjzx(Integer yjzx) {
        this.yjzx = yjzx;
    }

    public Integer getZxks() {
        return zxks;
    }

    public void setZxks(Integer zxks) {
        this.zxks = zxks;
    }

    public Integer getYjxh() {
        return yjxh;
    }

    public void setYjxh(Integer yjxh) {
        this.yjxh = yjxh;
    }

    public Integer getXmlx() {
        return xmlx;
    }

    public void setXmlx(Integer xmlx) {
        this.xmlx = xmlx;
    }

    public Integer getJfbz() {
        return jfbz;
    }

    public void setJfbz(Integer jfbz) {
        this.jfbz = jfbz;
    }

    public Integer getZfbz() {
        return zfbz;
    }

    public void setZfbz(Integer zfbz) {
        this.zfbz = zfbz;
    }

    public Integer getSfjg() {
        return sfjg;
    }

    public void setSfjg(Integer sfjg) {
        this.sfjg = sfjg;
    }

    public Integer getFhbz() {
        return fhbz;
    }

    public void setFhbz(Integer fhbz) {
        this.fhbz = fhbz;
    }

    public Integer getTzfhbz() {
        return tzfhbz;
    }

    public void setTzfhbz(Integer tzfhbz) {
        this.tzfhbz = tzfhbz;
    }

    public Integer getPspb() {
        return pspb;
    }

    public void setPspb(Integer pspb) {
        this.pspb = pspb;
    }

    public Integer getYzpb() {
        return yzpb;
    }

    public void setYzpb(Integer yzpb) {
        this.yzpb = yzpb;
    }

    public Integer getLsbz() {
        return lsbz;
    }

    public void setLsbz(Integer lsbz) {
        this.lsbz = lsbz;
    }

    public Integer getYepb() {
        return yepb;
    }

    public void setYepb(Integer yepb) {
        this.yepb = yepb;
    }

    public Integer getFysx() {
        return fysx;
    }

    public void setFysx(Integer fysx) {
        this.fysx = fysx;
    }

    public Integer getYsbz() {
        return ysbz;
    }

    public void setYsbz(Integer ysbz) {
        this.ysbz = ysbz;
    }

    public Integer getYstj() {
        return ystj;
    }

    public void setYstj(Integer ystj) {
        this.ystj = ystj;
    }

    public Integer getLsyz() {
        return lsyz;
    }

    public void setLsyz(Integer lsyz) {
        this.lsyz = lsyz;
    }

    public Integer getYwid() {
        return ywid;
    }

    public void setYwid(Integer ywid) {
        this.ywid = ywid;
    }

    public Integer getYyts() {
        return yyts;
    }

    public void setYyts(Integer yyts) {
        this.yyts = yyts;
    }

    public String getZfgh() {
        return zfgh;
    }

    public void setZfgh(String zfgh) {
        this.zfgh = zfgh;
    }

    public Integer getZtbz() {
        return ztbz;
    }

    public void setZtbz(Integer ztbz) {
        this.ztbz = ztbz;
    }

    public Integer getZtyzjlxh() {
        return ztyzjlxh;
    }

    public void setZtyzjlxh(Integer ztyzjlxh) {
        this.ztyzjlxh = ztyzjlxh;
    }

    public Integer getYzlx() {
        return yzlx;
    }

    public void setYzlx(Integer yzlx) {
        this.yzlx = yzlx;
    }

    public Integer getPsjg() {
        return psjg;
    }

    public void setPsjg(Integer psjg) {
        this.psjg = psjg;
    }

    public Integer getYzpx() {
        return yzpx;
    }

    public void setYzpx(Integer yzpx) {
        this.yzpx = yzpx;
    }

    public Integer getSqid() {
        return sqid;
    }

    public void setSqid(Integer sqid) {
        this.sqid = sqid;
    }

    public Integer getTpn() {
        return tpn;
    }

    public void setTpn(Integer tpn) {
        this.tpn = tpn;
    }

    public String getCdmc() {
        return cdmc;
    }

    public void setCdmc(String cdmc) {
        this.cdmc = cdmc;
    }

    public Integer getKjywsp() {
        return kjywsp;
    }

    public void setKjywsp(Integer kjywsp) {
        this.kjywsp = kjywsp;
    }

	public String getDs() {
		return ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
	}

	public Timestamp getFhsj() {
		return fhsj;
	}

	public void setFhsj(Timestamp fhsj) {
		this.fhsj = fhsj;
	}

    public BigDecimal getZtycjl() {
        return ztycjl;
    }

    public void setZtycjl(BigDecimal ztycjl) {
        this.ztycjl = ztycjl;
    }

    public Integer getZtmrcs() {
        return ztmrcs;
    }

    public void setZtmrcs(Integer ztmrcs) {
        this.ztmrcs = ztmrcs;
    }

    public BigDecimal getZtycsl() {
        return ztycsl;
    }

    public void setZtycsl(BigDecimal ztycsl) {
        this.ztycsl = ztycsl;
    }

	public Integer getGmywlb() {
		return gmywlb;
	}

	public void setGmywlb(Integer gmywlb) {
		this.gmywlb = gmywlb;
	}
    
}
