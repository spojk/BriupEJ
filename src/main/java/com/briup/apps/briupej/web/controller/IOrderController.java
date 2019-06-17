package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.VM.OrderAndOrderLineVM;
import com.briup.apps.briupej.bean.VM.OrderVM;
import com.briup.apps.briupej.bean.extend.orderExtend;
import com.briup.apps.briupej.service.IOrderService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(description = "订单管理相关接口")
@RestController
@RequestMapping("/order")

public class IOrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping("/findAll")
    @ApiOperation("查询所有订单")
    public Message findAll() {
        List<Order> list = orderService.findAll();
        return MessageUtil.success("sucess", list);
    }

    @ApiOperation("通过订单查询用户该订单的所有评价信息")
    @GetMapping("findAllComment")
    public Message findAllComment(Long id) {
        List<orderExtend> list = orderService.findAllComment(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("通过订单查询该用户的所有地址信息")
    @GetMapping("findAllAddress")
    public Message findAllAddress(Long id) {
        List<orderExtend> list = orderService.findAllAddress(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("通过订单查询该订单的用户信息")
    @GetMapping("findAllCustomer")
    public Message findAllCustomer(Long id) {
        List<orderExtend> list = orderService.findAllCustomer(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("通过订单查询员工信息")
    @GetMapping("findAllWaiter")
    public Message findAllWaiter(Long id) {
        List<orderExtend> list = orderService.findAllWaiter(id);
        return MessageUtil.success("success", list);
    }

    @ApiOperation("创建或更新订单")
    @PostMapping("saveOrupdate")
    public Message saveOrUpdate(Order order) throws Exception {
        orderService.saveOrupdate(order);
        return MessageUtil.message("成功");
    }

    @ApiOperation("删除订单")
    @GetMapping("deleteById")
    public Message deleteById(Long id) throws Exception {
        orderService.deleteById(id);
        return MessageUtil.message("删除成功");
    }

    @ApiOperation("查询订单")
    @GetMapping("findById")
    public Message findById(Long id) throws Exception {
        Order order = orderService.findById(id);
        return MessageUtil.success("sucess", order);
    }

    @ApiOperation("批量删除")
    @PostMapping("batchDelete")
    public Message batchDelete(long[] ids) throws Exception {
        orderService.batchDelete(ids);
        return MessageUtil.message("删除成功");
    }

    @ApiOperation("查询订单信息，并且订单级联关联属性")
    @GetMapping("query")
    public Message query(Long customerId, Long waiterId) {
        List<orderExtend> list = orderService.query(customerId, waiterId);
        return MessageUtil.success("sucess", list);
    }

    @ApiOperation("查询订单信息，并且订单级联关联属性")
    @GetMapping("queryBasic")
    public Message queryBasic(Long customerId, Long waiterId) {
        List<OrderVM> list = orderService.queryBasic(customerId, waiterId);
        return MessageUtil.success("sucess", list);
    }

    @PostMapping("save")
    @ApiOperation("保存订单信息")
    public Message save(@Valid @ModelAttribute OrderAndOrderLineVM order) throws Exception {
        orderService.save(order);
        return MessageUtil.message("成功");
    }

    @PostMapping("Add")
    @ApiOperation("通过传入的数量和产品id计算价值")
    public Message Add(int number, Long productId) {
        Double sum = orderService.Add(number, productId);
        return MessageUtil.success("sucess", sum);
    }
}
