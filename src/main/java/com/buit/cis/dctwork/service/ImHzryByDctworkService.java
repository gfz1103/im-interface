package com.buit.cis.dctwork.service;

import com.buit.cis.dctwork.request.CisHzyzQueryApiReq;
import com.buit.cis.dctwork.request.SysUserModel;
import com.buit.cis.dctwork.response.CisHzyzQueryResp;
import com.buit.commons.PageQuery;
import com.github.pagehelper.PageInfo;

/**
 * 患者住院interface
 * @ClassName: ImHzryByDctworkService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月12日 下午3:58:32
 *
 */
public interface ImHzryByDctworkService {

	/**
	 * 住院医生护士病人医嘱列表查询
	 * @Title: execute
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param cisHzyzQueryReqApi
	 * @param @param userModel
	 * @param @return    设定文件
	 * @return List<CisHzyzQueryApiResp>    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	PageInfo<CisHzyzQueryResp> execute(CisHzyzQueryApiReq cisHzyzQueryReqApi, SysUserModel userModel, PageQuery page);
}
