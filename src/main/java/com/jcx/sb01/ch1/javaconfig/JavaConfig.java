package com.jcx.sb01.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public FunctionService getFunctionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService getUseFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(getFunctionService());
        return useFunctionService;
    }
}
