package com.fredg.springcloud.service;

import com.fredg.springcloud.entities.Payment;

/**
 * @auther FredG.
 * @date on 2021/3/18
 */
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
