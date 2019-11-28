package com.abupdate.design.proxy.statics;

import java.math.BigDecimal;

/**
 * 携程票务代理商
 *
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class CtripTicketProxy {
    /**
     * 静态代理者所依赖售票/退票服务
     */
    private TicketService ticketService;

    /**
     * 【关键】通过构造方法注入被代理的对象
     *
     * @param ticketService 被代理对象
     */
    public CtripTicketProxy(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // ---------------- 具体使用被代理对象的方法功能 ----------------

    /**
     * 购票
     *
     * @param money 付款金额
     * @return 是否成功购票
     */
    public boolean buyTicket(BigDecimal money) {
        System.out.println("携程开始代理购票:");
        boolean result = this.ticketService.buyTicket(money);
        if (result) {
            System.out.println("携程代理购票成功，已出票。");
        } else {
            System.out.println("携程代理购票失败，无法出票。");
        }

        return result;
    }

    /**
     * 退票
     *
     * @param orderNo 退票订单号
     * @return 是否成功退票
     */
    public boolean refundTicket(String orderNo) {
        System.out.println("携程开始代理退票：");
        boolean result = this.ticketService.refundTicket(orderNo);
        if (result) {
            System.out.println("携程代理退票成功，已退票。");
        } else {
            System.out.println("携程代理退票失败，无法退票。");
        }
        return result;
    }

}