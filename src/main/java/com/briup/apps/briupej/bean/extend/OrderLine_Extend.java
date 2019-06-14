package com.briup.apps.briupej.bean.extend;

import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.OrderLine;
import com.briup.apps.briupej.bean.Product;

public class OrderLine_Extend extends OrderLine {
    private Product product;

    private Order  order;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
