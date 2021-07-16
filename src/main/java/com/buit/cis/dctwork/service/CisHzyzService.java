package com.buit.cis.dctwork.service;

import java.util.List;
import java.util.Map;

import com.buit.cis.dctwork.request.CisHzyzSssqApiReq;
import com.buit.cis.dctwork.response.CisHzyzModel;
import com.buit.commons.SysUser;


/**
 * 患者医嘱外部接口interface
 *
 * @author 龚方舟
 * @ClassName: CisHzyzService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020年10月12日 上午10:22:41
 */
public interface CisHzyzService {

	/**
	 * 根据yzxh查询病区医嘱
	 * @param yzxhList
	 * @return
	 * @throws
	 */
	List<CisHzyzModel> queryByYzxh(List<Integer> yzxhList);

	/**
	 * 根据记录序号查询病区医嘱
	 * @param jlxh 记录序号
	 */
	CisHzyzModel getById(Integer jlxh);

	/**
	 * 根据记录序号或者组套记录序号查询
	 *
	 * @param sbxh
	 * @param ztbz
	 * @return
	 */
	List<CisHzyzModel> doQueryByJlxhOrZtjlxh(Integer sbxh, Integer ztbz);
	
	/**
	 * 根据申请id更新抗菌药物医嘱
	 * @Title: updateYzAntibiotics
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param kjywsp
	 * @param @param sqid    设定文件
	 * @return void    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	void updateYzAntibiotics(Integer kjywsp, Integer sqid);
	
	/**
	 * 抗菌药物申请单更新到医嘱
	 * @Title: updateAntibioticsSqidByJlxh
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param sqid
	 * @param @param jlxh    设定文件
	 * @return void    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	void updateAntibioticsSqidByJlxh(Integer sqid, Integer jlxh);
	
	/**
	 * 更新医嘱的抗菌药物状态和申请id
	 * @Title: removeAntibioticsStatus
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param sqid    设定文件
	 * @return void    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	void removeAntibioticsStatus(Integer sqid);
	

	/**
	 * 新增
	 * @param cisHzyz
	 */
	void insert(CisHzyzModel cisHzyz);

	Map<String, Object> getzfbl(Map<String, Object> zfblParamMap);
	
	/**
	 * 保存住院手术申请单医嘱信息
	 * @Title: saveZySssqYzInfo
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param cisHzyzSssqApiReq    设定文件
	 * @return void    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	void saveZySssqYzInfo(CisHzyzSssqApiReq cisHzyzSssqApiReq, SysUser user);
	
	/**
	 * 更新抗菌药物医嘱提交状态
	 * @Title: updateAntibioticsTjByJlxh
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param jlxh    设定文件
	 * @return void    返回类型
	 * @author 龚方舟
	 * @throws
	 */
	void updateAntibioticsTjByJlxh(Integer jlxh);

}
