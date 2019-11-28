package com.abupdate.design.proxy.statics;

import java.math.BigDecimal;

/**
 * 具体的实现购票/退票的类 --迪士尼官网票务系统：
 * @Author: sheng ge
 * @Date: 2019/11/28 11:25
 */
public class DisneyOfficialWebsite implements TicketService{
    @Override
    public boolean buyTicket(BigDecimal money) {
        System.out.println("迪士尼票务系统收到" + money + "元，已购票");
        return true;
    }

    @Override
    public boolean refundTicket(String orderNo) {
        System.out.println("迪士尼票务系统正在为订单号：" + orderNo + "退票，已退票");
        return true;
    }
}
