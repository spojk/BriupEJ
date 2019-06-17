package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.VM.OrderAndOrderLineVM;
import com.briup.apps.briupej.bean.VM.OrderVM;
import com.briup.apps.briupej.bean.extend.orderExtend;

import java.util.List;


public interface IOrderService {
    List<Order> findAll();

    List<orderExtend> findAllComment(Long id);

    List<orderExtend> findAllAddress(Long id);

    List<orderExtend> findAllCustomer(Long id);

    List<orderExtend> findAllWaiter(Long id);


    void saveOrupdate(Order order) throws Exception;


    void deleteById(Long id) throws Exception;


    Order findById(Long id);


    void batchDelete(long[] ids) throws Exception;

    List<orderExtend> query(Long customerId, Long waiterId);
    List<OrderVM> queryBasic(Long customerId, Long waiterId);
    void save(OrderAndOrderLineVM order) throws Exception;
    Double Add(int number, Long productId);
}
