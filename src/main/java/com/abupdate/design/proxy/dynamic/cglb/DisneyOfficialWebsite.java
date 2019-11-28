package com.abupdate.design.proxy.dynamic.cglb;

import java.math.BigDecimal;

/**
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class DisneyOfficialWebsite {
    /**
     * 购票
     *
     * @param money 付款金额
     * @return 是否成功购票
     */
    public boolean buyTicket(BigDecimal money) {
        System.out.println("迪士尼票务系统收到" + money + "元，已购票");
        return true;
    }

    /**
     * 退票
     *
     * @param orderNo 退票订单号
     * @return 是否成功退票
     */
    public boolean refundTicket(String orderNo) {
        System.out.println("迪士尼票务系统正在为订单号：" + orderNo + "退票，已退票");
        return true;
    }
}