package com.fredg.springcloud.dao;

import com.fredg.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther FredG.
 * @date on 2021/3/18
 */
@Mapper //如果使用的Mybatis，推荐使用@Mapper
public interface PaymentDao {
    /**
     * 新增
     * create add一般都是返回的int
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     * @param参数.
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
