package com.richard.service.impl;

import com.richard.entity.Person;
import com.richard.service.IPersonManagementService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/1/18
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-config.xml", "classpath:config/datasource/datasource.xml"})
public class PersonManagementServiceImplTest {

    @Autowired
    private IPersonManagementService personManagementService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllPerson() {
        List<Person> allPerson = personManagementService.getAllPerson();
        System.out.println(String.format("查询所有人，返回结果：%s", allPerson));
        assertNotNull(allPerson);
    }
}