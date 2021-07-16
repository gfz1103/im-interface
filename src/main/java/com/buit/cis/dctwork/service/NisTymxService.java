package com.buit.cis.dctwork.service;

import java.util.List;

import com.buit.cis.dctwork.response.NisTymxModel;
import com.buit.cis.dctwork.response.QueryBackMedicineWardApiResp;
import com.buit.his.pha.commons.dto.QueryConditionDto;

/**
 * 退药明细外部接口interface
 * @ClassName: NisTymxService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月12日 下午8:19:28
 *
 */
public interface NisTymxService {

	/**
	 * 查询医嘱发药明细
	 * @param cond
	 * @return
	 * @throws
	 * */
    List<QueryBackMedicineWardApiResp> queryByCond(QueryConditionDto cond);
    
    /**
	 * 查询待退药记录
	 *
	 * @param jlxhList
	 * @return
	 */
    List<NisTymxModel> queryByJlxh(List<Integer> jlxhList);
}
