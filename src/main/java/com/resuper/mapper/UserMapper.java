package com.resuper.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.resuper.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from sys_user")
    public List<User> getAllUser();
}
