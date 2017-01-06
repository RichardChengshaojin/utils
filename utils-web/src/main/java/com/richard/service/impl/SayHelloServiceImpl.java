package com.richard.service.impl;

import com.richard.service.ISayHelloService;
import org.springframework.stereotype.Service;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/1/3
 */
@Service
public class SayHelloServiceImpl implements ISayHelloService {

    private String welcome;

    public SayHelloServiceImpl() {
        this.welcome = "默认的祝福语";
    }

    @Override
    public String sayHello() {
        return String.format("%s:%s", "来自系统的问候：", this.welcome);
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
}
