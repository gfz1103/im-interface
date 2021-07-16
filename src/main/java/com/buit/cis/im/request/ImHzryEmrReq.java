package com.buit.cis.im.request;

import com.buit.commons.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * @author songxx
 */
@ApiModel(value = "住院_病人入院_EMR")
public class ImHzryEmrReq extends PageQuery implements Serializable {
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    @NotNull(message = "开始时间不能为空")
    @ApiModelProperty(value = "开始时间")
    @NotNull(message = "结束时间不能为空")
    private String startDate;
    @ApiModelProperty(value = "结束时间")
    private String endDate;
    @ApiModelProperty(value = "病人科室 | 病人所在科室，对应GY_KSDM的代码")
    private Integer brks;
    @ApiModelProperty(value = "病人病区 | 病人所在病区，对应GY_KSDM的代码")
    private Integer brbq;
    @NotNull(message = "机构id不能为空")
    @ApiModelProperty(value = "机构id", hidden = true)
    private Integer jgid;
    @ApiModelProperty(value = "住院医生姓名")
    private String zyys;
    @ApiModelProperty(value = "出院方式 |与GY_DMZD（DMLB= 23）对应 1：治愈 2：好转 3：未愈 5：死亡 ：其他")
    private Integer cyfs;
    @ApiModelProperty(value = "患者姓名")
    private String brxm;

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

    public String getZyys() {
        return zyys;
    }

    public void setZyys(String zyys) {
        this.zyys = zyys;
    }

    public Integer getCyfs() {
        return cyfs;
    }

    public void setCyfs(Integer cyfs) {
        this.cyfs = cyfs;
    }

    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }
}
