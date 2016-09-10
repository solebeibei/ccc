package com.ly.dao.user;

import bean.User;
import com.ly.dao.user.impl.UserDaoImpl;

import java.util.List;

/**
 * Created by liyang21 on 2016/9/3.
 */
public interface UserDao {
    User selectUserById(int id);
    int insertUser(User user);
    int deleteUser(int id);
    int modifyUserByName(User user);
    List<User> selectAllList();
    int selectUser(User user);
}
