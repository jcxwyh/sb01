package com.jcx.sb01.ch1.aop;
/**
 * 基于注解拦截
 * 与
 * 基于方法拦截
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        System.out.println("------------------");

        demoMethodService.add();

        context.close();
    }
}
