package com.richard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2017/1/4
 */
@Controller
@RequestMapping(value = "WebDemo")
public class TestController {

    @RequestMapping(value = "")
    @ResponseBody
    public String test() {
        System.out.println("======test======");
        return "Response!!!";
    }
}
