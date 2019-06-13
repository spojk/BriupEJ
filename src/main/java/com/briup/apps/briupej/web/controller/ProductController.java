package com.briup.apps.briupej.web.controller;

import com.briup.apps.briupej.bean.Product;
import com.briup.apps.briupej.service.IProductService;
import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 刘帅男
 * @create: 2019-06-13 16:22
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @ApiOperation("查询所有")
    @GetMapping("findAll")
    public Message findAll() {
        List<Product> list = productService.findAll();
        return MessageUtil.success("查询成功", list);
    }

    @ApiOperation("通过ID查询数据")
    @GetMapping("/findById")
    public Message findById(Long id){
        return MessageUtil.success("查询成功！",productService.findById(id));
    }

    @ApiOperation("通过ID删除数据")
    @GetMapping("/deleteById")
    public Message deleteById(Long id) {
        try {
            productService.deleteById(id);
            return MessageUtil.success("success");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }

    }

    @ApiOperation("插入数据")
    @GetMapping("/insert")
    public Message insert(Product product) {
        try {
            productService.insert(product);
            return MessageUtil.success("success");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("通过ID修改数据")
    @GetMapping("/saveOrUpdate")
    public Message saveOrUpdate(Product product) {

        try {
            productService.saveOrUpdate(product);
            return MessageUtil.success("success");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }



}
