package com.sboot.springboot_base.service.impl;

import com.sboot.springboot_base.dao.UserDao;
import com.sboot.springboot_base.entity.User;
import com.sboot.springboot_base.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(1);
    }

    @Override
    public boolean addUser(User record) {
        return false;
    }
}
