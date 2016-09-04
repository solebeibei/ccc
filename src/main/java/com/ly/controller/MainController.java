package com.ly.controller;

import bean.User;
import com.ly.dao.user.UserDao;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by liyang21 on 2016/9/2.
 */
@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        List<User> list = userService.selectAllUser();
        mv.addObject("listSize", list.size());
        mv.addObject("listUser", list);
        mv.setViewName("hello");
        return mv;
    }
}
