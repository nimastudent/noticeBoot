package com.nima.webnotice.service.Impl;

import com.nima.webnotice.dao.UserDao;
import com.nima.webnotice.entities.User;
import com.nima.webnotice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public Boolean login(User user) {
        User dataUser = userDao.select(user.getId());
        if (dataUser == null){
            return false;
        }else {
            if (dataUser.getUserName() == user.getUserName()) return true;
        }
        return false;
    }
}
