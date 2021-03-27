package com.fredg.springcloud.service;

import com.fredg.springcloud.entities.Payment;

/**
 * @author FredG
 * @date 2020/2/18 10:40
 **/
public interface PaymentService {
    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
