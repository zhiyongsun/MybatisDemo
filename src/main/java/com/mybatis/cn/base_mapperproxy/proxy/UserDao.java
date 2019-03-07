package com.mybatis.cn.base_mapperproxy.proxy;

import com.mybatis.cn.base_mapperproxy.domain.User;

// mapper 的代理接口
//      操作接口 相当于 调用 mapper 达到对数据库操作

public interface UserDao {
    public void save(User user);
    public void remove(int id);
    public void modify(User user);
}
