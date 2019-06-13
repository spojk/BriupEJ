package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.Address;
import com.briup.apps.briupej.bean.AddressExample;
import com.briup.apps.briupej.mapper.AddressMapper;
import com.briup.apps.briupej.service.IAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘帅男
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

    @Override
    public void saveAddress(Address address) throws  Exception{
        addressMapper.insert(address);
    }

    @Override
    public Address selectByPrimaryKey(Long id){
        return  addressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Long id){
        return addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Address address) {
        return addressMapper.insert(address);
    }

    @Override
    public int updateByPrimaryKey(Address address){
        return addressMapper.updateByPrimaryKey(address);
    }


}
