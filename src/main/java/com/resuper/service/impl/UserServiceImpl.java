package com.resuper.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.resuper.entity.User;
import com.resuper.mapper.UserMapper;
import com.resuper.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @DS("oraclemaster")
    public List<User> getOracleAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    @DS("mysql8slave_1")
    public List<User> getMysql81AllUser() {
        return userMapper.getAllUser();
    }

    @Override
    @DS("mysql8slave_2")
    public List<User> getMysql82AllUser() {
        return userMapper.getAllUser();
    }

    @Override
    @DS("mysql8slave")
    public List<User> getMysql8LoaderAllUser() {
        return userMapper.getAllUser();
    }

    @Override@DS("mysql5slave_3")
    public List<User> getMysql5AllUser() {
        return userMapper.getAllUser();
    }
}
