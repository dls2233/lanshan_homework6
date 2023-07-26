package com.example.lanshan_homework6.control;

import com.example.lanshan_homework6.dao.UserService;
import com.example.lanshan_homework6.lostGoods;
import com.example.lanshan_homework6.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

public class usersControl {
    @Controller
    public class UsersController {

        // 注入Service接口对象
        @Resource
        UserService userService;

        // 设置默认跳转页面
        @RequestMapping("/")
        public String index() {
            return "login";
        }

        @PostMapping("/login")
        public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
            // 接收前端传过来的参数,传给service层，再由service层传递给dao层，由dao层去查询数据库，把查询结果
            // 原路返回，封装到一个user对象中，通过判断user对象中的属性和前端参数是否一致而实现登录效果
            String str= userService.usersLogin(username);

            if (str != null) {
                // 判断用户名和密码是否一致
                if (str.equals(password)) {
                    // 成功跳转到success页面
                    return "success";
                }
            }
            // 失败就回到登录页面，无提示版本
            return "login";
        }
        @RequestMapping("lostQuery")
        public List<lostGoods> lostQuery()
        {
            return userService.lostQuery();
        }

        @RequestMapping("lostAdd")
        public int lostAdd(lostGoods l){
            return userService.lostAdd(l);
        }

        @RequestMapping("lostDel")
        public int lostDel(int id) {return userService.lostDel(id);}

        @RequestMapping("lostqueryByName")
        public List<lostGoods> lostQueryChange(String lostName)
        {
            return userService.lostQueryChange(lostName);
        }
    }
}
