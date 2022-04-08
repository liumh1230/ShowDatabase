package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询全部数据
    @Select("select * from user")
    List<User> findAll();

    //新增数据
    @Insert("insert into user(id,name,age,email)values(#{id},#{name},#{age},#{email})")
    int save(User user);

    //删除数据
    @Delete("delete from user where id = #{id}")
    int delete(int id);

    //更新数据
    @Update("update user set id=#{id},name=#{name},age=#{age},email=#{email} where id=#{id}")
    int update(User user);

    //通过id查询用户
    @Select("select * from user where id =#{id}")
    User getUser(int id);
}
