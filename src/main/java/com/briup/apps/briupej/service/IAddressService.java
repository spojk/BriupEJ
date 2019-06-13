package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAddressService {

    List<Address> findByCostomerID(Long customerId);

    void saveAddress(Address address) throws Exception;

    Address selectByPrimaryKey(Long id);

    int insert(Address address) throws Exception;

    int deleteByPrimaryKey(Long id) throws Exception;

    int updateByPrimaryKey(Address address) throws Exception;


}
