package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.extend.orderExtend;
import com.briup.apps.briupej.service.IOrderService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Api(description ="订单管理相关接口")
@RestController
@RequestMapping("Order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**@GetMapping("/selectByPrimaryKey")
    public Message selectByPrimaryKey(@ApiParam(value = "主键",required = true) @RequestParam(value = "id")long id){
        Order order=orderService.selectByPrimaryKey(id);
        return MessageUtil.success("success",order);
    }**/

    @ApiOperation("输入id进行删除")
    @GetMapping("/deleteByPrimaryKey")
    public Message deleteByPrimaryKey(@ApiParam(value = "主键",required = true) @RequestParam(value = "id")long id ){
        try {
            orderService.deleteByPrimaryKey(id);
            return MessageUtil.success("删除成功!");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("不输入id进行插入")
    @GetMapping("/insert")
    public  Message  insert(Order record){
        try {
            orderService.insert(record);
            return MessageUtil.success("插入成功!");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("输入id进行更新")
    @GetMapping("/updateByPrimaryKey")
    public Message updateByPrimaryKey(Order record){
        try {
            orderService.updateByPrimaryKey(record);
            return MessageUtil.success("修改成功!");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }


    @ApiOperation("输入id进行查询")
    @GetMapping("/findAllOrderById")
    public Message findAllOrderById(@ApiParam(value = "主键",required = true) @RequestParam(value = "id")long id ){
        orderExtend orderExtend=orderService.findAllOrderById(id);
        return MessageUtil.success("success",orderExtend);
    }

    @ApiOperation("查询所有")
    @GetMapping("findAllOrder")
    public  Message findAllOrder(){
        List<Order>  list =orderService.findAllOrder();
        return MessageUtil.success("查询成功!",list);
    }

    @ApiOperation("模糊查询")
    @GetMapping("/query")
    public Message  query(Order order){
        List<Order>  list=orderService.query(order);
        return MessageUtil.success("success",list);
    }


    @ApiOperation("批量删除")
    @PostMapping("/betchDelete")
    public Message betchDelete(@NotNull(message = "id不能为空")long[] ids) throws Exception{
     orderService.betchDelete(ids);
     return MessageUtil.success("批量删除成功");
    }

}

