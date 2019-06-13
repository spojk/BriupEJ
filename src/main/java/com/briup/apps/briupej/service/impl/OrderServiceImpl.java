package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.OrderExample;
import com.briup.apps.briupej.bean.extend.orderExtend;
import com.briup.apps.briupej.mapper.OrderMapper;
import com.briup.apps.briupej.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public long countByExample(OrderExample example) {
        return orderMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderExample example) {
        return orderMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) throws Exception {
        Order order = orderMapper.findAllOrderById(id);
        if (order.getId() == null) {
            throw new Exception("要删除的用户不存在");
        } else {
            return orderMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public int insert(Order record) throws Exception {
        if (record.getId() == null) {
                return orderMapper.insert(record);

        } else {
            throw new Exception("请不要输入id值");
        }
    }

    @Override
    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public List<Order> selectByExample(OrderExample example) {
        return orderMapper.selectByExample(example);
    }

    /**@Override
    public Order selectByPrimaryKey(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }**/

    @Override
    public int updateByExampleSelective(Order record, OrderExample example) {
        return orderMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Order record, OrderExample example) {
        return orderMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Order record) throws Exception {
        if (record.getId() == null) {
                return orderMapper.insert(record);
        } else {
            throw new Exception("请不要输入id值");
        }
    }

    @Override
    public orderExtend findAllOrderById(Long id) {
        return orderMapper.findAllOrderById(id);
    }

    @Override
    public List<Order> findAllOrder() {
        return orderMapper.findAllOrder();
    }

    @Override
    public List<Order> query(Order order) {
        return orderMapper.query(order);
    }

    @Override
    public void betchDelete(long[] ids) throws Exception {
        for(long id:ids){
            orderMapper.deleteByPrimaryKey(id);
        }
    }
}
