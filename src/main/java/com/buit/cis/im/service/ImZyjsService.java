package com.buit.cis.im.service;

import java.sql.Timestamp;

/**
 * 住院结算
 */
public interface ImZyjsService {
    /**
     * 获取病人最后一次结算的时间点;如果病人没有结算记录则取病人入院时间
     *
     * @param zyh 住院号
     */
    Timestamp getLastZyjsSj(Integer zyh);

    /**
     * 验证费用明细的费用日期
     *
     * @param zyh  住院号
     * @param fyrq 费用日期
     */
    boolean validFyrq(Integer zyh, Timestamp fyrq);
}
