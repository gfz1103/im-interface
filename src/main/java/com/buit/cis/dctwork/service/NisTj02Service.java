package com.buit.cis.dctwork.service;

import java.util.List;

import com.buit.cis.dctwork.response.NisTj02Model;

/**
 * 医嘱提交02外部接口interface
 * @ClassName: NisTj02Service
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚方舟
 * @date 2020年10月12日 下午4:10:34
 *
 */
public interface NisTj02Service {

	/**
	 * 根据jlxh查询病区提交记录
	 * @param jlxhList
	 * @return
	 * @throws
	 * */
    List<NisTj02Model> queryByJlxh(List<Integer> jlxhList);
    
    /**
	 * 根据yzxh查询未全退的yzxh
	 *
	 * @param yzxhList
	 * @return
	 * */
    List<Integer> queryByFybzEqZeroByYzxh(List<Integer> yzxhList);
    
    /**
	 * 根据tjxh查询未全退的tjxh
	 *
	 * @param tjxhList
	 * @return
	 * */
	List<Integer> queryByFybzEqZeroByTjxh(List<Integer> tjxhList);
	
	/**
	 * 根据tjxh查询yzxh
	 *
	 * @param tjxhList
	 * @return
	 * */
    List<Integer> queryYzxhByTjxh(List<Integer> tjxhList);
}
