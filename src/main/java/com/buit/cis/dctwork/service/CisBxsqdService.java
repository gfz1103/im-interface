package com.buit.cis.dctwork.service;

import java.util.List;

import com.buit.cis.dctwork.model.CisBxsqd;

public interface CisBxsqdService {

	List<CisBxsqd> queryBxsqdByZyh(Integer zyh, Integer jgid);
}
