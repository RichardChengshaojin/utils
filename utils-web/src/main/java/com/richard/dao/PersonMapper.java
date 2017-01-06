package com.richard.dao;

import com.richard.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/1/5
 */
@Repository
public interface PersonMapper {

    List<Person> queryAllPerson();
}
