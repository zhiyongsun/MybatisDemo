package com.mybatis.cn.base_mapperproxy.run;

import com.mybatis.cn.base_mapperproxy.proxy.UserDao;
import com.mybatis.cn.base_mybatis_crud.factory.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class DeleteRun {
    public static void main(String[] args) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        UserDao ud = session.getMapper(UserDao.class);
        ud.remove(11);
        session.commit();
    }
}
