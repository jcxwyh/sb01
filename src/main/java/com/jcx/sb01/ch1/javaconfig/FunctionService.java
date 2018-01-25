package com.jcx.sb01.ch1.javaconfig;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+word+"!";
    }
}
