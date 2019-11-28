package com.abupdate.design.proxy.dynamic.cglb;

import java.math.BigDecimal;

/**
 * 客户端
 *
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个方法拦截器的子类 -- 也就是动态代理类，并注入被代理的对象
        // 然后获取动态代理类的实例对象
        DisneyOfficialWebsite proxy = (DisneyOfficialWebsite) new CtripTicketCGLibProxy(new DisneyOfficialWebsite())
                .getProxyInstance();
		// 携程代理商买票
        proxy.buyTicket(new BigDecimal("666.90"));
        // 携程代理商退票
        proxy.refundTicket("AAA8708980");

    }
}