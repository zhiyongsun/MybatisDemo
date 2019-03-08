package com.mybatis.cn.base_mapperproxy.run;

import com.mybatis.cn.base_mapperproxy.domain.User;
import com.mybatis.cn.base_mapperproxy.factory.MySqlSessionFactory;
import com.mybatis.cn.base_mapperproxy.proxy.UserDao;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DqlRun {
    public static void main(String[] args) {
//        单个查询
        SqlSession session = MySqlSessionFactory.getSqlSession();
        UserDao ud = session.getMapper(UserDao.class);

//      单个
//        User u = ud.selectUser(2);
//        System.out.println(u);

        List<User> userList = ud.selectMultpleUser();
        System.out.println(userList.size());
        for (User u:userList){
            System.out.println(u);
        }
        session.commit();
    }
}
