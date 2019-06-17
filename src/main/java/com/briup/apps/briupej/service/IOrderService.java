package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.VM.OrderAndOrderLineVM;
import com.briup.apps.briupej.bean.VM.OrderVM;
import com.briup.apps.briupej.bean.extend.orderExtend;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-10 13:38
 */
public interface IOrderService {
    List<Order> findAll();//查询所有订单

    List<orderExtend> findAllComment(Long id);

    List<orderExtend> findAllAddress(Long id);

    List<orderExtend> findAllCustomer(Long id);

    List<orderExtend> findAllWaiter(Long id);

    //创建新订单
    void saveOrupdate(Order order) throws Exception;

    //    删除order
    void deleteById(Long id) throws Exception;

    //查询订单
    Order findById(Long id);

    //批量删除
    void batchDelete(long[] ids) throws Exception;

    List<orderExtend> query(Long customerId, Long waiterId);
    List<OrderVM> queryBasic(Long customerId, Long waiterId);
    void save(OrderAndOrderLineVM order) throws Exception;
    Double Add(int number, Long productId);//查询价值
}
