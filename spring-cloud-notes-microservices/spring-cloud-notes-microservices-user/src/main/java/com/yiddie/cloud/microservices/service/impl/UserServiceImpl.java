package com.yiddie.cloud.microservices.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yiddie.cloud.microservices.mapper.cloud.UserMapper;
import com.yiddie.cloud.microservices.model.cloud.User;
import com.yiddie.cloud.microservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * title
 * description
 *
 * @author yiddie
 * @date 2019/10/18 4:34 下午
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public String getUserInfo(Long id) {
        try {
            User user = userMapper.selectByPrimaryKey(id);
            return JSON.toJSONString(user, SerializerFeature.WriteDateUseDateFormat);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
