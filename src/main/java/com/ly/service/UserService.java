package com.ly.service;

import bean.User;

import java.util.List;

/**
 * Created by liyang21 on 2016/9/4.
 */
public interface UserService {
     public  List<User> selectAllUser();
     public int selectUser(User user);
}
