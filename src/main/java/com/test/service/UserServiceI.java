package com.test.service;

import com.test.domain.User;

public interface UserServiceI {

    public User addUser(User user);

    public User getUser(Long userId);
}
