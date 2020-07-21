package com.resuper;

import com.resuper.entity.User;
import com.resuper.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MainApplicationTests {

    @Resource
    private UserService userServiceImpl;

    @Test
    void contextLoads() {

        List<User> oracleusersoracle = userServiceImpl.getOracleAllUser();

        List<User> mysql8users1 = userServiceImpl.getMysql81AllUser();
        List<User> mysql8users2 = userServiceImpl.getMysql82AllUser();

        List<User> mysql8Loaderusers1 = userServiceImpl.getMysql8LoaderAllUser();
        List<User> mysql8Loaderusers2 = userServiceImpl.getMysql8LoaderAllUser();


        List<User> mysql5users = userServiceImpl.getMysql5AllUser();


        System.out.println("主数据源oracle数据");
        System.out.println(oracleusersoracle);
        System.out.println("mysql8数据库1的数据");
        System.out.println(mysql8users1);
        System.out.println("mysql8数据库2的数据");
        System.out.println(mysql8users2);
        // 同一个方法负载均衡
        System.out.println("同一个方法在数据库上负载均衡");
        System.out.println(mysql8Loaderusers1);
        System.out.println(mysql8Loaderusers2);

        System.out.println("mysql5的数据");
        System.out.println(mysql5users);
    }



}
