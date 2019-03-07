package com.mybatis.cn.base_mybatis_crud.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MySqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory = null;

    //利用静态代码块，执行获取  sqlSession.commit();
    static {
        // 读取配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis_conf.xml");
            // 获取 sqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build((is));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 获取 sqlSession会话
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
