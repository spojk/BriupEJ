package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.Product;
import com.briup.apps.briupej.service.IProductService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: ej
 * @description: 产品控制器类
 * @author: charles
 * @create: 2019-06-10 17:52
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("findAll")
    public Message findAll() {
        List<Product> list = productService.findAll();
        return MessageUtil.success("success", list);
    }

}