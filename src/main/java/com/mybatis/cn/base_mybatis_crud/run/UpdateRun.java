package com.mybatis.cn.base_mybatis_crud.run;

import com.mybatis.cn.base_mybatis_crud.domain.User;
import com.mybatis.cn.base_mybatis_crud.factory.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class UpdateRun {
    public static void main(String[] args) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
//        现将要更新的数据查出 或者根据 id 更新
//        创建带 id 的 User，直接更新
        User u = new User();
        u.setId(1);
        u.setAccount("zbj");
        u.setPwd("1234");

        session.update("com.mybatis.cn.base_mybatis_crud.mapper.UserMapper.updateUser", u);
        session.commit();
    }
}
