package com.example.demo.mapper;

import com.example.demo.pojo.Order;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findAllOrder();

    //新增数据
    int save(Order order);

    //删除数据

     int delete(int id);

    //更新数据

    int update(Order order);

    //通过id查询用户
      List<Order> getUser(@Param("id") int id);
}
