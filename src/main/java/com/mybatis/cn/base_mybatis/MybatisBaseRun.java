package com.mybatis.cn.base_mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 */
public class MybatisBaseRun {
    public static void main(String[] args) {
        try {
            // 读取配置文件
            InputStream is = Resources.getResourceAsStream("mybatis_conf.xml");
            // 获取 sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build((is));
            // 获取 sqlSession会话
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 数据库操作 -- 添加用户
            User user = new User();
            user.setAccount("tsz");
            user.setPwd("134134");
            user.setName("唐三藏");

            // 插入数据
            sqlSession.insert("com.mybatis.cn.base_mybatis.mapper.UserMapper.saveUser",user);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

