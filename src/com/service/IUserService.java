package com.service;

import com.dao.User;

/**
 * Created with IntelliJ IDEA
 * Created By JiaYue
 * Date: 2019/6/14
 * Time: 17:36
 */
public interface IUserService {
    public void save(User user);

    public User findUserById(Integer id);
}
