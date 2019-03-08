package com.mybatis.cn.base_mapperproxy.domain;

public class Student {
    private int id;
    private String name;
    private int stunum;

    private Claz claz;

    public Claz getClaz() {
        return claz;
    }

    public void setClaz(Claz claz) {
        this.claz = claz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStunum() {
        return stunum;
    }

    public void setStunum(int stunum) {
        this.stunum = stunum;
    }



    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stunum=" + stunum +
                ", claz=" + claz +
                '}';
    }
}

