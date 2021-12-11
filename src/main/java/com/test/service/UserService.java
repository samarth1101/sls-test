package com.test.service;

import com.test.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceI {

    public User addUser(User user) {
        return user;
    }

    public User getUser(Long userId) {
        User user = new User();
        user.setUserName("David");
        user.setUserDisplayName("David James");
        return user;
    }

}
