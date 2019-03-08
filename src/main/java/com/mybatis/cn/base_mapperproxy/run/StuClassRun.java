package com.mybatis.cn.base_mapperproxy.run;

import com.mybatis.cn.base_mapperproxy.domain.Student;
import com.mybatis.cn.base_mapperproxy.factory.MySqlSessionFactory;
import com.mybatis.cn.base_mapperproxy.proxy.StuClassDao;
import org.apache.ibatis.session.SqlSession;

public class StuClassRun {
    public static void main(String[] args) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        StuClassDao stuClassDao = session.getMapper(StuClassDao.class);
        Student stu = stuClassDao.getStuAndClass(2);
        System.out.println(stu);
        session.commit();
    }
}
