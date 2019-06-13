package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.Address;
import com.briup.apps.briupej.service.IAddressService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/12 14:58
 */
@Validated
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;


    @ApiOperation("通过用户ID查询收货地址")
    @GetMapping("getCustomerAddresses")
    public Message deleteById(Long id) throws Exception {
        List<Address> byCostomerID = addressService.findByCostomerID(id);

        return MessageUtil.success("查询成功", byCostomerID);
    }

    @ApiOperation("保存用户地址")
    @GetMapping("addAddress")
    public Message deleteById(Address address) throws Exception {
        if (address.getCustomerId() == null) {
            return MessageUtil.error("用户ID不能为空");

        }
        addressService.saveAddress(address);
        return MessageUtil.success("success");
    }

    @ApiOperation("通过ID查询数据")
    @GetMapping("/selectByPrimaryKey")
    public Message selectByPrimaryKey(Long id){
        Address address = addressService.selectByPrimaryKey(id);
        if(address == null){
            return MessageUtil.error("查询不存在");
        }
        return  MessageUtil.success("查询成功",address);

    }

    @ApiOperation("通过ID删除数据")
    @GetMapping("/deleteByPrimaryKey")
    public Message deleteByPrimaryKey(Long id) {
        try{
            addressService.deleteByPrimaryKey(id);
            return MessageUtil.success("删除成功！");
        }catch (Exception e){
            return MessageUtil.error("删除失败!"+e.getMessage());
        }
    }

    @ApiOperation("插入数据")
    @GetMapping("/insert")
    public  Message insert(Address address){
        try{
            addressService.insert(address);
            return MessageUtil.success("插入成功");
        }
        catch (Exception e){
            return MessageUtil.error("插入失败！"+e.getMessage());
        }
    }

    @ApiOperation("通过ID修改数据")
    @GetMapping("/updateByPrimaryKey")
    public Message updateByPrimary(Address address){

        try{
            addressService.updateByPrimaryKey(address);
            return MessageUtil.success("更新成功！");
        }
        catch (Exception e){
            return MessageUtil.error("更新失败！");
        }
    }

    @ApiOperation("批量删除Address")
    @GetMapping("/batchDelete")
    public Message batchDelete(Long[] ids){
        if (ids==null){
            return MessageUtil.error("失败!");
        }
        try {
            addressService.batchDelete(ids);
            return MessageUtil.success("成功!");
        } catch (Exception e) {
            return MessageUtil.error("失败!");
        }

    }
}