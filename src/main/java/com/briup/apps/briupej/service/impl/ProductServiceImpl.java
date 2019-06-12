package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.Product;
import com.briup.apps.briupej.bean.ProductExample;
import com.briup.apps.briupej.mapper.ProductMapper;
import com.briup.apps.briupej.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ej
 * @description: 产品是实现类
 * @author: charles
 * @create: 2019-06-10 17:50
 **/
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example = new ProductExample();
        return productMapper.selectByExample(example);
    }
}
