package com.fredg.springcloud.service.impl;

import com.fredg.springcloud.dao.PaymentDao;
import com.fredg.springcloud.entities.Payment;
import com.fredg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther FredG.
 * @date on 2021/3/18
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
