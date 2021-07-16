package com.buit.cis.im.service;

import java.util.List;

import com.buit.cis.im.response.ImRcjlModel;

/**
 * 入出记录查询
 */
public interface ImRcjlService {
    /**
     * 住院号查询患者的入出记录
     * @param zyh
     * @return
     */
    List<ImRcjlModel> queryRcjl(Integer zyh);
}
