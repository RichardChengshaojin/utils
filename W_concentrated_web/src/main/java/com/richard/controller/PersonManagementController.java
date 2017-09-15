package com.richard.controller;

import com.richard.service.IPersonManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/1/5
 */
@Controller
@RequestMapping(value = "persons")
public class PersonManagementController {

    private final IPersonManagementService personManagementService;

    @Autowired
    public PersonManagementController(IPersonManagementService personManagementService) {
        this.personManagementService = personManagementService;
    }


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object queryAllPerson() {
        return personManagementService.getAllPerson();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object query(@PathVariable String name) {
        Map<String, Object> res = new HashMap<>();
        res.put("value", "Single Person" + name);
        return res;
    }


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object addPersons() {
        System.out.println("============add persons============");
        return new HashMap<String, Object>();
    }
}
