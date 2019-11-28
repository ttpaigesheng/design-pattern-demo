package com.abupdate.design.proxy.dynamic.cglb;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib动态代理类
 *
 * @author 代码风水师 https://github.com/about-cloud/JavaCore
 * @version jdk1.8
 */
public class CtripTicketCGLibProxy implements MethodInterceptor {
    /**
     * 被代理的对象
     */
    private Object object;

    /**
     * 构造方法注入被代理对象
     *
     * @param object 被代理的对象
     */
    public CtripTicketCGLibProxy(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        // 创建一个增强器
        Enhancer enhancer = new Enhancer();
        // 设置代理者的父类
        enhancer.setSuperclass(this.object.getClass());
        // 设置回调对象
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("携程代理商开始执行" + method.getName() + "操作：");
        Object result = method.invoke(this.object, objects);
        System.out.println("携程代理商执行" + method.getName() + "操作结束。");
        return result;
    }
}
