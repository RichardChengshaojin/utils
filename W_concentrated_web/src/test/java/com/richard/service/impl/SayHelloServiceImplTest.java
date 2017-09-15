package com.richard.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/1/18
 */
public class SayHelloServiceImplTest {

    private SayHelloServiceImpl sayHelloService;

    @Before
    public void setUp() throws Exception {
        sayHelloService = new SayHelloServiceImpl();
    }

    @After
    public void tearDown() throws Exception {
        sayHelloService = null;
    }

    @Test
    public void testSayHello() throws Exception {
        assertNotNull(sayHelloService.sayHello());
    }

    @Test
    public void testGetWelcome() {
        assertNotNull(sayHelloService.getWelcome());
    }

    @Test
    public void testSetWelcome() {
        sayHelloService.setWelcome("welcome");
        assertEquals("welcome", sayHelloService.getWelcome());
    }
}