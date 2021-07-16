package com.buit.cis.dctwork.service;

import java.util.List;
import java.util.Map;

import com.buit.cis.dctwork.response.CisZyHzyjModel;


/**
 * 会诊意见外部接口interface
 * @ClassName: CisZyHzyjService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月12日 下午3:53:16
 *
 */
public interface CisZyHzyjService {

	public List<CisZyHzyjModel> queryHzyj(Integer sqxh);

	/**
	 * 查询会诊意见-电子病历数据引用
	 * @Title: queryHzsq
	 * @Description:
	 * @param @param zyh
	 * @param @return    设定文件
	 * @return List<CisZyHzsqModel>    返回类型
	 * @author
	 * @throws
	 */
	List<Map<String,Object>> queryHzyjForBl(Integer sqxh);
}
