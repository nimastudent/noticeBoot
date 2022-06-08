package com.nima.webnotice;

import com.nima.webnotice.dao.UserDao;
import com.nima.webnotice.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = WebNoticeApplication.class)
class WebNoticeApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUserName("test123");
        user.setPassword("112333");
        int insert = userDao.insert(user);
        System.out.println(insert);
    }

    @Test
    void delete(){
        int delete = userDao.delete(2L);

        System.out.println(delete);
    }

}
