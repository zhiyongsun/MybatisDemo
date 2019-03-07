package com.mybatis.cn.base_mapperproxy.run;

import com.mybatis.cn.base_mapperproxy.domain.User;
import com.mybatis.cn.base_mapperproxy.proxy.UserDao;
import com.mybatis.cn.base_mybatis_crud.factory.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

public class UpdateRun {
    public static void main(String[] args) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        User u = new User();
        u.setId(13);
        u.setAccount("lc");
        u.setName("lclc");

        UserDao ud = session.getMapper(UserDao.class);
        ud.modify(u);
        session.commit();
    }
}
