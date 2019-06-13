package com.briup.apps.briupej.bean.extend;

import com.briup.apps.briupej.bean.Comment;
import com.briup.apps.briupej.bean.Order;

public class CommentExtend extends Comment {

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
