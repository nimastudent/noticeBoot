package com.nima.webnotice.dao;

import com.nima.webnotice.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    int insert(User user);

    User selectByNameAndPass(User user);

    int delete(Long id);


    User select(Long id);

    List<User> list();
}
