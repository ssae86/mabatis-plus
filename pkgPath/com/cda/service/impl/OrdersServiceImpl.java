package com.cda.service.impl;

import com.cda.entity.Orders;
import com.cda.mapper.OrdersMapper;
import com.cda.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单  服务实现类
 * </p>
 *
 * @author cda
 * @since 2021-11-13
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
