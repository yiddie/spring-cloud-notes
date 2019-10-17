package com.yiddie.controller;

import com.yiddie.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * title
 * description
 *
 * @author yiddie
 * @date 2019/10/18 12:15 上午
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/info/{id}")
    public String getUserInfo(@PathVariable("id") Long id) {
        return userService.getUserInfo(id);
    }
}
