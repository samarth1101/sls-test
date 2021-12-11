package com.test.api;

import com.test.domain.User;
import com.test.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    UserServiceI userServiceI;

    @Autowired
    public UserController(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }

    @GetMapping(value = "/user")
    public ResponseEntity<User> getUser(@RequestParam Long userId) {
        User user = userServiceI.getUser(userId);
        return ResponseEntity.ok(user);
    }

}
