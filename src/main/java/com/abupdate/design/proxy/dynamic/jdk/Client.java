package com.abupdate.design.proxy.dynamic.jdk;

import com.abupdate.design.proxy.statics.DisneyOfficialWebsite;
import com.abupdate.design.proxy.statics.TicketService;

import java.math.BigDecimal;

/**
 * 客户端
 *
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个携程代理商，并注入被代理的实际迪士尼官方票务系统
        // 然后获取一个携程代理商的实例对象
       TicketService proxy = (TicketService) new CtripTicketJdkProxy(new DisneyOfficialWebsite()).getProxyInstance();
        // 携程代理商买票
        proxy.buyTicket(new BigDecimal("999"));
        // 携程代理商退票
        proxy.refundTicket("c67394279");
    }

    /**
     * jdk动态代理较静态代理更加灵活，不用每次都写所有代理方法，而且还可以 invoke 方法中拦截方法、动态修改参数等。
     */
}