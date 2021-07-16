package com.buit.cis.im.service;


import java.util.Map;

import com.buit.cis.im.response.ImFeeFymxYjModel;

/**
 * 费用明细医技外部接口interface
 * @ClassName: imFeeFymxYjService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月13日 下午2:10:02
 *
 */
public interface ImFeeFymxYjService {

	/**
	 * 根据医嘱序号查询医技信息
	 *
	 * @param yzxh
	 * @return
	 */
	public ImFeeFymxYjModel doQueryByYzxh(Integer yzxh);

	/**
	 * 根据医嘱序号更新执行状态和执行次数
	 *
	 * @param map
	 */
	void updateZxztAndZxcs(Map<String, Object> map);
}
