package com.briup.apps.briupej.mapper.extend;

import com.briup.apps.briupej.bean.VM.OrderVM;
import com.briup.apps.briupej.bean.extend.orderExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface OrderExtendMapper {
    List<orderExtend> findAllComment(Long id);

    List<orderExtend> findAllAddress(Long id);

    List<orderExtend> findAllCustomer(Long id);

    List<orderExtend> findAllWaiter(Long id);

    List<orderExtend> query(
            @Param("customerId") Long customerId,
            @Param("waiterId") Long waiterId
    );
    List<OrderVM> queryBasic(
            @Param("customerId") Long customerId,
            @Param("waiterId") Long waiterId
    );
     Double Add(int number, Long productId);//查询价值

}
