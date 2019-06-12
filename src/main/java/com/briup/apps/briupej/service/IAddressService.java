package com.briup.apps.briupej.service;

import com.briup.apps.briupej.bean.Address;

import java.util.List;

public interface IAddressService {

    List<Address> findByCostomerID(Long customerId);

}
