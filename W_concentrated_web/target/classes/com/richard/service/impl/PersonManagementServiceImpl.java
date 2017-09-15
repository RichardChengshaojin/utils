package com.richard.service.impl;

import com.richard.dao.PersonMapper;
import com.richard.entity.Person;
import com.richard.service.IPersonManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/1/5
 */
@Service
public class PersonManagementServiceImpl implements IPersonManagementService {

    private final PersonMapper personMapper;

    @Autowired
    public PersonManagementServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public List<Person> getAllPerson() {
        System.out.println(personMapper.queryAllPerson());
        return personMapper.queryAllPerson();
    }
}
