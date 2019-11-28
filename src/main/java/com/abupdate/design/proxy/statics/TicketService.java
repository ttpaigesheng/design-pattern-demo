package com.abupdate.design.proxy.statics;

import java.math.BigDecimal;

/**
 * 索票的服务接口
 * @Author: sheng ge
 * @Date: 2019/11/28 11:24
 */
public interface TicketService {

    /**
     * 购票
     *
     * @param money 付款金额
     * @return 是否成功购票
     */
    boolean buyTicket(BigDecimal money);

    /**
     * 退票
     *
     * @param orderNo 退票订单号
     * @return 是否成功退票
     */
    boolean refundTicket(String orderNo);
}
