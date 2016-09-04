package test;

import bean.User;
import com.ly.dao.user.UserDao;
import com.ly.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by liyang21 on 2016/9/4.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class test2 {


    //
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @Test
    public void mytest() {
        System.out.println("yes ,I am ");
    }

    @Test
    public void testUser() {

//        System.out.println(user.getAge() + "," + user.getName());
        //  System.out.println(user.toString());
        System.out.println(userDao.toString());
    }

    @Test
    public void getAllUser() {
//        List<User> list = userDao.selectAllList();
        List<User> list=userService.selectAllUser();

        for (User user : list) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setAge(100);
        user.setName("mesi");
        int result = userDao.insertUser(user);
        System.out.println(result);
    }

    @Test
    public void deleteUserById() {
        System.out.println(userDao.deleteUser(12));
    }

    @Test
    public void modifyUserByName() {
        User user = new User();
        user.setAge(100999);
        user.setName("mesi");
        System.out.println(userDao.modifyUserByName(user));
    }

    @Test
    public void selectById() {
        User user = userDao.selectUserById(13);
        if (user != null) {
            System.out.println(user.getAge() + "," + user.getName());
        }
    }
}
