package com.mybatis.cn.base_dql_query.run;

import com.mybatis.cn.base_dql_query.domain.User;
import com.mybatis.cn.base_dql_query.factory.MySqlSessionFactory;
import com.mybatis.cn.base_dql_query.proxy.UserDao;
import org.apache.ibatis.session.SqlSession;

public class DqlRun {
    public static void main(String[] args) {
//        单个查询
        SqlSession session = MySqlSessionFactory.getSqlSession();
        UserDao ud = session.getMapper(UserDao.class);
        User u = ud.selectUser(1);
        System.out.println(u);
        session.commit();
    }
}
