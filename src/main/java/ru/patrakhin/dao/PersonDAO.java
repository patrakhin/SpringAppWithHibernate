package ru.patrakhin.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.patrakhin.models.Person_dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class PersonDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Person_dao> index() {
        Session session = sessionFactory.getCurrentSession();
        return null;
    }

    public Optional<Person_dao> show(String email){
        return null;
    }

    public Person_dao show(int id) {
        return null;
    }

    public void save(Person_dao person) {

    }

    public void update(int id, Person_dao updatedPerson) {

    }

    public void delete(int id) {

    }
}
