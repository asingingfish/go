package com.flyfish.go.service.impl;

import com.flyfish.go.dao.UserDao;
import com.flyfish.go.entity.User;
import com.flyfish.go.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuyiming on 2017/8/18.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User findUserById(String id) {
        return userDao.findUserById(id);
    }
}
