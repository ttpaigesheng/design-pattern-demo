package com.abupdate.design.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理类
 *
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class CtripTicketJdkProxy implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object object;

    /**
     * 构造方法注入被代理对象（这点和静态代理一样）
     */
    public CtripTicketJdkProxy(Object object) {
        this.object = object;
    }

    /**
     * 获取代理者的实例对象
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(this.object.getClass().getClassLoader(),
                this.object.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增加日志功能
        System.out.println("携程代理商开始执行" + method.getName() + "操作：");
        Object result = method.invoke(this.object, args);
        System.out.println("携程代理商执行" + method.getName() + "操作结束。");
        return result;
    }
}