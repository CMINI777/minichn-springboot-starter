package com.minichn.controller;

import com.minichn.pojo.MinichnJSONResult;
import com.minichn.pojo.User;
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
        u.setName("minichn未封装（不携带状态）");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("minichn未封装（不携带状态）");
        u.setDesc("hello minichn未封装（不携带状态）~~");

        return u;
    }

    @RequestMapping("/getUserJson")
//	@ResponseBody
    public MinichnJSONResult getUserJson() {

        User u = new User();
        u.setName("minichn");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("minichn");
        u.setDesc("hello minichn~~hello minichn~~");

        return MinichnJSONResult.ok(u);
    }
}
