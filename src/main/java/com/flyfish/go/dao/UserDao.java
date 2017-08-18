package com.flyfish.go.dao;

import com.flyfish.go.entity.User;

/**
 * Created by yuyiming on 2017/8/18.
 */
public interface UserDao {
    User findUserById(String id);
}
