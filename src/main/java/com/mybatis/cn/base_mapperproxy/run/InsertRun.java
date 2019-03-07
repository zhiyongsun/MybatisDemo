package com.mybatis.cn.base_mapperproxy.run;

import com.mybatis.cn.base_mapperproxy.proxy.UserDao;
import com.mybatis.cn.base_mapperproxy.domain.User;
import com.mybatis.cn.base_mapperproxy.factory.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class InsertRun {
    public static void main(String[] args) {
        SqlSession session =  MySqlSessionFactory.getSqlSession();

        User u = new User();
        u.setAccount("lzs");
        u.setName("lzsa");
        u.setPwd("dbcyl");

        UserDao ud = session.getMapper(UserDao.class);
        ud.save(u);
        session.commit();
    }
}
