package com.fredg.springcloud.alibaba.controller;

import com.fredg.springcloud.alibaba.domain.CommonResult;
import com.fredg.springcloud.alibaba.domain.Order;
import com.fredg.springcloud.alibaba.service.IdGeneratorSnowflake;
import com.fredg.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author FredG
 * @date 2020/3/8 14:21
 **/
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private IdGeneratorSnowflake idGeneratorSnowflake;

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @GetMapping("order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }

    /**
     * 生成id,通过雪花算法
     *
     * @return
     */
    @GetMapping("snowflake")
    public String getIDBySnowflake() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            threadPool.submit(() -> {
                System.out.println(idGeneratorSnowflake.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello snowflake";
    }
}
