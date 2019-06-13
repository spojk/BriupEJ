package com.briup.apps.briupej.web.controller;


import com.briup.apps.briupej.bean.Waiter;
import com.briup.apps.briupej.service.WaiterService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Api(description ="服务员管理相关接口")
@RestController
@RequestMapping("waiter")
public class WaiterController {


    @Autowired
    private WaiterService waiterService;

    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(Waiter waiter){
        List<Waiter> list = waiterService.query(waiter);
        return MessageUtil.success("success",list);
    }


        @GetMapping("findAll")
        public Message findAll(){

            List<Waiter> waiter = waiterService.findAll();

            return MessageUtil.success("success",waiter);

        }
    @ApiOperation("通过id查询")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id") long id){
        Waiter waiter = waiterService.findById(id);
        return MessageUtil.success("success",waiter);
    }

    @ApiOperation("保存或更新用户信息")
    @GetMapping("saveOrUpdate")
    public Message saveOrUpdate(Waiter waiter){
        try {
            waiterService.saveOrUpdate(waiter);
            return MessageUtil.success("保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("通过id删除用户信息")
    @GetMapping("deleteById")
    public Message deleteById(@ApiParam(value = "主键",required = true) @RequestParam("id") long id){
        try {
            waiterService.deleteById(id);
            return MessageUtil.success("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("插入数据")
    @GetMapping("insert")
    public Message insert(Waiter waiter){
        try {
            waiterService.insert(waiter);
            return MessageUtil.success("插入成功");
        }catch (Exception e){
            e.printStackTrace();
            return  MessageUtil.error(e.getMessage());
        }
    }
    @ApiOperation("批量删除")
    @PostMapping("/batchDelete")
    public Message batchDelete(@NotNull(message = "id不能为空")long[] ids) throws Exception{
        waiterService.batchDelete(ids);
        return MessageUtil.success("批量删除成功");
    }
    }

