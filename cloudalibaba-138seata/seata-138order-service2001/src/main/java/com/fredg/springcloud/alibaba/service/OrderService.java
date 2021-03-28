package com.fredg.springcloud.alibaba.service;
import com.fredg.springcloud.alibaba.domain.*;

/**
 * @author FredG
 * @date 2020/3/8 13:55
 **/
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
