package com.yxchen.hotspot.service;

import com.yxchen.hotspot.common.bean.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);

}
