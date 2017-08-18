package com.flyfish.go.web.controller;

import com.flyfish.go.entity.User;
import com.flyfish.go.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuyiming on 2017/8/18.
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String index(Model model) {
        User user=userService.findUserById("123");
        model.asMap().put("username",user.getUsername());
        logger.debug(user.getUsername());
        return "index";
    }
}
