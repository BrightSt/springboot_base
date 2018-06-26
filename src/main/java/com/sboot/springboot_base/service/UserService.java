package com.sboot.springboot_base.service;

import com.sboot.springboot_base.entity.User;

import java.util.List;

public interface UserService {

    User getUserById(int userId);

    boolean addUser(User record);
}
