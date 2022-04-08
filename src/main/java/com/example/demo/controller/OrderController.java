package com.example.demo.controller;

import com.example.demo.Service.OrderService;
import com.example.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    //查询全部数据
    @RequestMapping(value ="")
    @ResponseBody
    public List<Order> ListOrder(){
        return orderService.findAllOrder();
    }
    //新增数据
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(Order order){
        int result = orderService.save(order);
        if(result >= 1){
            return "添加成功！";
        }else{
            return "添加失败！";
        }
    }


    //删除数据
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id){
        int result = orderService.delete(id);
        if(result >= 1){
            return "删除成功！";
        }else{
            return "删除失败！";
        }
    }
    //更新数据
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(Order order){
        int result = orderService.update(order);
        if(result >= 1){
            return "更新成功！";
        }else{
            return "更新失败！";
        }
    }
    //通过id查询用户
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public   List<Order> getUser(@PathVariable int id){
        return orderService.getUser(id);
    }



}
