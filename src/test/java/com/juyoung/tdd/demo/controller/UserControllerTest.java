package com.juyoung.tdd.demo.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * User CRUD 테스트 ( list, find, create, update, delete )
 * 1. ds
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Test
    public void getUser_returnsDetails() throws Exception {

    }
}
