package com.ly.dao.user.impl;

import bean.User;
import com.ly.dao.base.impl.GenericBaseDAOImpl;
import com.ly.dao.user.UserDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyang21 on 2016/9/3.
 */
@Repository("userDao")
public class UserDaoImpl extends GenericBaseDAOImpl implements UserDao {
    @Override
    public User selectUserById(int id) {
       return  this.executeForObject("userMapper.getUser",id,User.class);
    }

    @Override
    public int insertUser(User user) {
       return  this.execute("userMapper.insert",user);
    }

    @Override
    public int deleteUser(int id) {
        return  this.execute("userMapper.delete",id);
    }

    @Override
    public int modifyUserByName(User user) {
        return  this.execute("userMapper.update",user);
    }

    @Override
    public List<User> selectAllList() {
       return  this.executeForObjectList("userMapper.selectAll");
    }
}
