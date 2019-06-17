package com.briup.apps.briupej.mapper.extend;

import com.briup.apps.briupej.bean.extend.CustomerExtend;

import java.util.List;


public interface CustomerExtendMapper {
  List<CustomerExtend> findMyAddress(Long id) ;
  List<CustomerExtend> findMyMessage(Long id);
  List<CustomerExtend> findMyOrder(Long id);
}
