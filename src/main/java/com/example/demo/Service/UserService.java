package com.example.demo.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //查询全部数据
    public List<User> findAll(){
        return userMapper.findAll();
    }
    //新增数据
    public int save(User user){
        return userMapper.save(user);
    }
    //删除数据
    public int delete(int id){
        return userMapper.delete(id);
    }
    //更新数据
    public int update(User user){
        return userMapper.update(user);
    }
    //通过id查询用户
    public User getUser(int id){
        return userMapper.getUser(id);
    }
}
