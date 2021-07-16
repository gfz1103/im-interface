package com.buit.cis.dctwork.service;

import java.util.List;
import java.util.Map;

import com.buit.cis.dctwork.response.CisZyHzsqModel;



/**
 * 会诊申请外部接口interface
 * @ClassName: CisZyHzsqService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月12日 下午3:40:48
 *
 */
public interface CisZyHzsqService {

	/**
	 * 查询会诊申请
	 * @Title: queryHzsq
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param zyh
	 * @param @return    设定文件
	 * @return List<CisZyHzsqModel>    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	List<CisZyHzsqModel> queryHzsq(String zyh);
	/**
	 * 查询会诊申请-电子病历数据引用
	 * @Title: queryHzsq
	 * @Description: 
	 * @param @param zyh
	 * @param @return    设定文件
	 * @return List<CisZyHzsqModel>    返回类型
	 * @author
	 * @throws
	 */
	List<Map<String,Object>> queryHzsqForBl(String zyh);
}
