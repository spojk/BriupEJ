package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.Address;
import com.briup.apps.briupej.mapper.AddressMapper;
import com.briup.apps.briupej.service.IAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author codingfanlt
 * @date 2019/6/12 14:45
 */

@Service
public class AddressServiceImpl implements IAddressService {

    @Resource
    private AddressMapper addressMapper;

    @Override
    public List<Address> findByCostomerID(Long customerId) {
        return addressMapper.selectByCustomerId(customerId);
    }
}
