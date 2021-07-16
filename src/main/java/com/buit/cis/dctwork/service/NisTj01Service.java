package com.buit.cis.dctwork.service;

import java.util.List;

import com.buit.cis.dctwork.response.QueryDispensingWardApiResp;
import com.buit.cis.dctwork.response.QuerySubmitApplyApiResp;
import com.buit.his.pha.commons.dto.QueryConditionDto;


/**
 * 医嘱提交01外部接口interface
 * @ClassName: NisTj01Service
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月12日 下午1:18:51
 *
 */
public interface NisTj01Service {

	 /**
     * 病区待发药记录查询
     *
     * @param cond
     * @return
     */
    List<QueryDispensingWardApiResp> queryByCond(QueryConditionDto cond);
    
    /**
     * 联结NIS_TJ02表根据zyh查询tjxh
     *
     * @param zyhList
     * @return
     */
    List<Integer> queryTjxhByZyh(List<Integer> zyhList);
    
    /**
     * 查询待发药提交单
     * @param cond
     * @return
     */
    List<QuerySubmitApplyApiResp> queryDispensingTjd(QueryConditionDto cond);
}
