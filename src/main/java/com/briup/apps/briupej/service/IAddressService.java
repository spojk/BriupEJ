package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAddressService {

    List<Address> findByCostomerID(Long customerId);

    void saveAddress(Address address) throws Exception;

}
