package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //查询全部数据
    @RequestMapping(value ="")
    @ResponseBody
    public List<User> ListUser(){
        return userService.findAll();
    }
    //新增数据
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
        public String insert(User user){
            int result = userService.save(user);
            if(result >= 1){
                return "添加成功！";
            }else{
                return "添加失败！";
            }
        }


    //删除数据
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id){
        int result = userService.delete(id);
        if(result >= 1){
            return "删除成功！";
        }else{
            return "删除失败！";
        }
    }
    //更新数据
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(User user){
        int result = userService.update(user);
        if(result >= 1){
            return "更新成功！";
        }else{
            return "更新失败！";
        }
    }
    //通过id查询用户
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable int id){
        return userService.getUser(id).toString();
    }



}
