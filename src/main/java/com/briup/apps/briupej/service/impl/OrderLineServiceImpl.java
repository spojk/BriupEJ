package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.OrderLine;
import com.briup.apps.briupej.bean.OrderLineExample;
import com.briup.apps.briupej.mapper.OrderLineMapper;
import com.briup.apps.briupej.service.IOrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘帅男
 * @date 2019/6/14 21:44
 */
@Service
public class OrderLineServiceImpl implements IOrderLineService {
    @Resource
    private OrderLineMapper orderLineMapper;


    @Override
    public void saveOne(OrderLine orderLine) throws Exception {
        orderLineMapper.insert(orderLine);
    }

    @Override
    public void updateOne(OrderLine orderLine) throws Exception {

        orderLineMapper.updateByPrimaryKey(orderLine);
    }

    @Override
    public List<OrderLine> findAll() {
        OrderLineExample example = new OrderLineExample();
        return orderLineMapper.selectByExample(example);
    }

    @Override
    public OrderLine findById(Long id) {
        return orderLineMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        OrderLine orderLine = orderLineMapper.selectByPrimaryKey(id);
        if (orderLine == null) {
            throw new Exception("要删除的地址信息不存在");
        }
        orderLineMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) throws Exception {
        for (Long id : ids) {
            deleteById(id);
        }
    }
}
