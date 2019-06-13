package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(Long id);

    int deleteById(Long id) throws Exception;

    int insert(Product product) throws Exception;

    int saveOrUpdate(Product product) throws Exception;

}
