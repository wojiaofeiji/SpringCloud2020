package com.fredg.springcloud.service;

import com.fredg.springcloud.entities.CommonResult;
import com.fredg.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**

 *
 * @author FredG
 * @version 1.0
 * @date 2020/03/07
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "fallback");
    }
}
