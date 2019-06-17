package com.briup.apps.briupej.mapper.extend;

import com.briup.apps.briupej.bean.extend.OrderLine_Extend;

import java.util.List;

/**
 * @author rui
 * @create 2019-06-13 9:24
 */
public interface OrderLine_ExtendMapper {
    List<OrderLine_Extend> selectById(Long id);
}
