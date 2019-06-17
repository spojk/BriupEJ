package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Customer;
import com.briup.apps.briupej.bean.extend.CustomerExtend;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void saveOrUpdate(Customer customer) throws Exception;

    void deleteById(long id) throws Exception;

    void batchDelete(long[] ids) throws Exception;
    List<CustomerExtend> findMyMessage(Long id);
    List<CustomerExtend> findMyAddress(Long id);
    List<CustomerExtend> findMyOrder(Long id);
}
