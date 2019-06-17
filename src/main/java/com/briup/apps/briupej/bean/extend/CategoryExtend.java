package com.briup.apps.briupej.bean.extend;

import com.briup.apps.briupej.bean.Category;
import com.briup.apps.briupej.bean.Product;

/**
 * @author spojk
 * @create 2019-06-17 17:14
 */
public class CategoryExtend extends Category{
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
