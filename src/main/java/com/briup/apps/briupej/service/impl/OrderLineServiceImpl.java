package com.briup.apps.briupej.service.impl;

import com.briup.apps.briupej.bean.OrderLine;
import com.briup.apps.briupej.bean.OrderLineExample;
import com.briup.apps.briupej.bean.extend.OrderLine_Extend;
import com.briup.apps.briupej.mapper.OrderLineMapper;
import com.briup.apps.briupej.service.OrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderLineServiceImpl implements OrderLineService {

    @Resource
    private OrderLineMapper orderLineMapper;
    @Override
    public long countByExample(OrderLineExample example) {
        return orderLineMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderLineExample example) {
        return orderLineMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) throws Exception {
        OrderLine orderLine=orderLineMapper.findAllOrderLineById(id);
        if(orderLine.getId()==null){
            throw new Exception("要删除的用户不存在");
        }else {
            return orderLineMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public int insert(OrderLine record) throws  Exception {
        if(record.getId()==null){

            return orderLineMapper.insert(record);
        }else {
            throw new Exception("订单已存在");
        }
    }

    @Override
    public int insertSelective(OrderLine record) {
        return orderLineMapper.insertSelective(record);
    }

    @Override
    public List<OrderLine> selectByExample(OrderLineExample example) {
        return orderLineMapper.selectByExample(example);
    }

    /**@Override
    public Order_line selectByPrimaryKey(Long id) {
        return orderLineMapper.selectByPrimaryKey(id);
    }**/

    @Override
    public int updateByExampleSelective(OrderLine record, OrderLineExample example) {
        return orderLineMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OrderLine record, OrderLineExample example) {
        return orderLineMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderLine record) {
        return orderLineMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderLine record) throws Exception{
        if (record!=null){
            return orderLineMapper.updateByPrimaryKey(record);
        }else {
            throw new Exception("请输入id值");
        }

    }

    @Override
    public OrderLine_Extend findAllOrder_lineById(Long id)  {

        return orderLineMapper.findAllOrderLineById(id);
    }

    @Override
    public List<OrderLine_Extend> findAllOrder_line() {
        return orderLineMapper.findAllOrderLine();
    }

    @Override
    public void betchDelete(long[] ids) throws Exception {
        for(long id:ids){
            orderLineMapper.deleteByPrimaryKey(id);
        }
    }
}
