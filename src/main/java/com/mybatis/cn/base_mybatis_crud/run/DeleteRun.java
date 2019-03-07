package com.mybatis.cn.base_mybatis_crud.run;

import com.mybatis.cn.base_mybatis_crud.factory.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class DeleteRun {
    public static void main(String[] args) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        session.insert("com.mybatis.cn.base_mybatis_crud.mapper.UserMapper.deleteUser",12);
        session.commit();
    }
}
