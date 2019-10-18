package com.yiddie.cloud.microservices.web.controller;

import com.yiddie.cloud.microservices.service.UserService;
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
 * @date 2019/10/18 4:23 下午
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/info/{id}")
    public String getUserInfo(@PathVariable Long id) {
        return userService.getUserInfo(id);
    }

}
