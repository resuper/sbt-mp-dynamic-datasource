package com.resuper.service;

import com.resuper.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getOracleAllUser();
    public List<User> getMysql81AllUser();
    public List<User> getMysql82AllUser();
    public List<User> getMysql8LoaderAllUser();
    public List<User> getMysql5AllUser();

}
