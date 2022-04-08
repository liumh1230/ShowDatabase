package com.example.demo.Service;

import cn.hutool.core.util.RandomUtil;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import com.example.demo.pojo.User;
import com.fasterxml.uuid.impl.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
        @Autowired
        private OrderMapper orderMapper;
        @Autowired
        private UserService userService;
        //查询全部数据
        public List<Order> findAllOrder(){
            return orderMapper.findAllOrder();
        }
        //新增数据
        public int save(Order order){
            order.setMoney(new BigDecimal(RandomUtil.randomInt(0,100)));
            order.setOrderNumber(UUID.randomUUID().toString());
            return orderMapper.save(order);
        }
        //删除数据
        public int delete(int id){
            return orderMapper.delete(id);
        }
        //更新数据
        public int update(Order order){
            order.setMoney(new BigDecimal(RandomUtil.randomInt(0,100)));
            order.setOrderNumber(UUID.randomUUID().toString());
            return orderMapper.update(order);
        }
        //通过id查询用户
        public List<Order> getUser(int id){
            User user = userService.getUser(id);

            return orderMapper.getUser(id);
        }

}
