package com.abupdate.design.proxy.statics;

import java.math.BigDecimal;

/**
 * 客户端
 *
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个携程代理商，并注入迪士尼官网票务系统
        CtripTicketProxy proxy = new CtripTicketProxy(new DisneyOfficialWebsite());
        // 携程代理商买票
        proxy.buyTicket(new BigDecimal("9999"));
        // 携程代理商退票
        proxy.refundTicket("AAA809876");
    }
}