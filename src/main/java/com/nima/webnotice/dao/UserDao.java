package com.nima.webnotice.dao;

import com.nima.webnotice.entities.User;

import java.util.List;


public interface UserDao {

    int insert(User user);

    int delete(Long id);


    User select(Long id);

    List<User> list();
}
