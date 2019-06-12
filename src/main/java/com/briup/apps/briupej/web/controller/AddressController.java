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

import java.util.List;

/**
 * @author codingfanlt
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
}
