package com.richard.controller;

import com.richard.service.ISayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2017/1/3
 */
@Controller
@RequestMapping(value = "hello")
public class SayHelloController {

    @Autowired
    private ISayHelloService helloService;

    @RequestMapping("say")
    public String sayHello(ModelMap respMap) {
        respMap.put("msg", helloService.sayHello());
        System.out.println("======sayHello======");
        return "sayHello";
    }
}
