package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.OrderLine;
import com.briup.apps.briupej.service.IOrderLineService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/14 21:45
 */
@Validated
@RestController
@RequestMapping("/v1/orderLine")
@Api(tags = "订单项相关操作")
public class OrderLineController {
    @Autowired
    private IOrderLineService orderLineService;

    @PostMapping()
    @ApiOperation("新增订单项")
    public Message insertOrderLine(OrderLine orderLine) throws Exception {
        orderLineService.saveOne(orderLine);
        return MessageUtil.success("添加成功");
    }


    @DeleteMapping("{id}")
    @ApiOperation("通过ID删除")
    public Message deleteById(@NotNull @PathVariable("id") Long id) throws Exception {
        orderLineService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @PostMapping("delete")
    @ApiOperation("批量删除订单项信息")
    public Message batchDelete(Long[] ids) throws Exception {
        orderLineService.batchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }

    @PutMapping()
    @ApiOperation("修改订单项信息")
    public Message updateOrderLine(OrderLine orderLine) throws Exception {
        orderLineService.updateOne(orderLine);
        return MessageUtil.success("更新成功");
    }


    @GetMapping("{id}")
    @ApiOperation("获取指定订单项信息")
    public Message getOrderLine(@NotNull(message = "ID 不能为空") @PathVariable("id") Long id) {
        return MessageUtil.success("success",orderLineService.findById(id));
    }


    @GetMapping()
    @ApiOperation("查询所有订单项信息")
    public Message findAll() {
        List<OrderLine> list = orderLineService.findAll();
        return MessageUtil.success("success", list);
    }
}
