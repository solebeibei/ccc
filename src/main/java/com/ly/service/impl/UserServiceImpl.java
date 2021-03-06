package com.ly.service.impl;

import bean.User;
import com.ly.dao.user.UserDao;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyang21 on 2016/9/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /** 选择所有的用户
     *
     * @return
     */
    @Override
    public List<User> selectAllUser() {
      return  userDao.selectAllList();
    }
    public int selectUser(User user){
        return  userDao.selectUser(user);
    }
}
