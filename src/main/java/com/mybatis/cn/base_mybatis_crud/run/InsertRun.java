package com.mybatis.cn.base_mybatis_crud.run;

import com.mybatis.cn.base_mybatis.User;
import com.mybatis.cn.base_mybatis_crud.factory.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class InsertRun {
    public static void main(String[] args) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        User u = new User();
        u.setAccount("swk");
        u.setName("孙悟空");
        u.setPwd("123");

        session.insert("com.mybatis.cn.base_mybatis_crud.mapper.UserMapper.saveUser",u);
        session.commit();
    }
}
