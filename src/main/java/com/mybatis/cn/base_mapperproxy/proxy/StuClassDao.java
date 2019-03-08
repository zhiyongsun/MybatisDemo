package com.mybatis.cn.base_mapperproxy.proxy;

import com.mybatis.cn.base_mapperproxy.domain.Student;

public interface StuClassDao {
//    查询学生及其班级及其班级信息
    public Student getStuAndClass(int id);
}
