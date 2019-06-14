package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.OrderLine;

import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/14 21:44
 */
public interface IOrderLineService {

    void saveOne(OrderLine orderLine) throws Exception;

    void updateOne(OrderLine orderLine) throws Exception;

    List<OrderLine> findAll();

    OrderLine findById(Long id);

    void deleteById(Long id) throws Exception;

    void batchDelete(Long[] ids) throws Exception;
}
