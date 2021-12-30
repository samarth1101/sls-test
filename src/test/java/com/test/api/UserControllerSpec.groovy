package com.test.api

import com.test.service.UserServiceI
import org.mockito.Mockito
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MockMvcBuilder
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification


class UserControllerSpec extends Specification {
    MockMvc mockMvc
    UserController userController
    UserServiceI userServiceI;

    def setup() {
        userServiceI= Mockito.mock(UserServiceI.class)
        userController = new UserController(userServiceI)
        this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build()
    }

    def whenGetUserAPIIsCalled_returnOKAndUser() {
        given: "User APIs are available to use"
        //Mockito.doReturn()

        when: "getUser API is called"


        then: "it should return user and status 200"

    }


}

