package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zzyy
 * @date 2020/2/18 10:27
 **/
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
