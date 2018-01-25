package com.jcx.sb01.ch1.javaconfig;

/**
 * 此处没有使用@Service和@Autowired注解
 */
public class UseFunctionService {
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return this.functionService.sayHello(word);
    }
}
