package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.OrderLine;
import com.briup.apps.briupej.bean.extend.OrderLine_Extend;
import com.briup.apps.briupej.service.OrderLineService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Api(description="订单项功能管理")
@RestController
@RequestMapping("OrderLine")
public class OrderLineController {

    @Autowired
    private OrderLineService orderLineService;

    /**@GetMapping("/selectByPrimaryKey")
    public Message selectByPrimaryKey(@ApiParam(value = "主键",required = true) @RequestParam(value = "id") long id){
        Order_line orderLine=orderLineService.selectByPrimaryKey(id);
        return MessageUtil.success("success",orderLine);
    }**/

    @ApiOperation("输入id进行删除")
    @GetMapping("/deleteByPrimaryKey")
    public Message deleteByPrimaryKey(@ApiParam(value = "主键",required = true) @RequestParam(value = "id") long id){
        try {
            orderLineService.deleteByPrimaryKey(id);
            return MessageUtil.success("删除成功!");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("不输入id进行删除")
    @GetMapping("/insert")
    public Message insert(OrderLine record){
        try {
            orderLineService.insert(record);
            return MessageUtil.success("插入成功!");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("输入id进行更新")
    @GetMapping("/updateByPrimaryKey")
    public Message updateByPrimaryKey(OrderLine record){
        try {
            orderLineService.updateByPrimaryKey(record);
            return MessageUtil.success("更新成功!");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }


    @ApiOperation("输入id进行查询")
    @GetMapping("findAllOrder_lineById")
    public Message findAllOrder_lineById(@ApiParam(value = "主键",required = true) @RequestParam(value = "id") Long id) throws Exception{
        OrderLine_Extend order_line_extend=orderLineService.findAllOrder_lineById(id);
        if (order_line_extend.getId()!=null){
            return MessageUtil.success("success",order_line_extend);

        }else
        {  throw new Exception("此id不存在");
        }

    }

    @ApiOperation("查询所有")
    @GetMapping("findAllOrder_line")
    public Message findAllOrder_line(){
        List<OrderLine_Extend> order_line_extends=orderLineService.findAllOrder_line();
        return MessageUtil.success("success",order_line_extends);
    }

    @ApiOperation("批量删除")
    @PostMapping("/betchDelete")
    public  Message  betchDelete(@NotNull(message = "id不能为空")long[] ids) throws Exception{
        orderLineService.betchDelete(ids);
        return  MessageUtil.success("删除成功");
    }

}
