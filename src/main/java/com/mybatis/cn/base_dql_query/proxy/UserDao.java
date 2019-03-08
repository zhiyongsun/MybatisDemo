package com.mybatis.cn.base_dql_query.proxy;

import com.mybatis.cn.base_dql_query.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询用户
     * @return
     */
    public User selectUser(int id);

    /**
     * 查询所有用户
     * @return
     */
//    public List<User> selectMulitpleUser();

}
