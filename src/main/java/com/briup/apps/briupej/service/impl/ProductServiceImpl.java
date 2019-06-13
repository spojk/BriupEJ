package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.Product;
import com.briup.apps.briupej.bean.ProductExample;
import com.briup.apps.briupej.mapper.ProductMapper;
import com.briup.apps.briupej.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**

 * @author: 刘帅男
 * @create: 2019-06-13 16:20
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

    @Override
    public Product findById(Long id){
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(Long id) throws Exception {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int saveOrUpdate(Product product) throws Exception {
        return productMapper.updateByPrimaryKey(product);
    }

    @Override
    public int insert(Product product) throws Exception {
        return productMapper.insert(product);
    }

}
