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
        User result = userDao.selectByNameAndPass(user);
        if (result == null) {
            return false;
        } else {
            if (result.getUserName().equals(user.getUserName())
                    && result.getPassword().equals(user.getPassword()))
                user.setId(result.getId());
                return true;
        }
    }
}
