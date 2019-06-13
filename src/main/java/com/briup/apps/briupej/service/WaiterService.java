package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Waiter;

import java.util.List;

public interface WaiterService {

    List<Waiter> query(Waiter waiter);
    List<Waiter> findAll();

    Waiter findById(long id);

    void saveOrUpdate(Waiter waiter) throws Exception ;

    void insert(Waiter waiter) throws  Exception;


    void batchDelete(long[] ids) throws  Exception;

    void deleteById(long id) throws Exception ;
}
