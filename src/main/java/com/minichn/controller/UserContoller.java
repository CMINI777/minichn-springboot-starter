package com.minichn.controller;

import com.minichn.pojo.MinichnJSONResult;
import com.minichn.pojo.User;
import com.minichn.pojo.UserLombok;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by minichn on 2019/8/15 0015.
 */

//@Controller
@RestController        // @RestController = @Controller + @ResponseBody  //IDEA中快捷键使用ctrl+shift+o可以把所有没有用的一些包移除
@RequestMapping("/user")
public class UserContoller {

    @RequestMapping("/getUser")
//	@ResponseBody
    public User getUser() {

        User u = new User();
        u.setName("minichn-User未封装（不携带状态）");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("minichn-User未封装（不携带状态）");
        u.setDesc("hello minichn-User未封装（不携带状态）~~");

        return u;
    }

    @RequestMapping("/getUserJson")
//	@ResponseBody
    public MinichnJSONResult getUserJson() {

        User u = new User();
        u.setName("minichn-User封装");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("minichn-User封装");
        u.setDesc("hello minichn-User封装~~hello minichn-User封装~~");

        return MinichnJSONResult.ok(u);
    }

    @RequestMapping("/getUserLombokJson")
//	@ResponseBody
    public MinichnJSONResult getUserLombokJson() {

        UserLombok u = new UserLombok();
        u.setName("minichn-UserLombok封装");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("minichn-UserLombok封装");
        u.setDesc("hello minichn-UserLombok封装~~POJO搬到龙目岛——Lombok~~");

        return MinichnJSONResult.ok(u);
    }
}
