package com.mybatis.cn.base_mapperproxy.domain;

import java.util.List;

public class Claz {
    private int id;
    private String classname;
    private List<Student> stuList;
//

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public Claz() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Claz{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", stuList=" + stuList +
                '}';
    }
}
