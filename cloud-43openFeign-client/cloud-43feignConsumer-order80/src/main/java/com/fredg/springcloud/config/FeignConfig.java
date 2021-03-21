package com.fredg.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenFeignClient配置
 *
 * @author zzyy
 * @create 2020/3/6 18:02
 **/
@Configuration
public class FeignConfig {

    /**
     * feignClient配置日志级别
     *
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        // 请求和响应的头信息,请求和响应的正文及元数据
        // NONE: 默认的，不显示任何日志
        // BASIC: 仅记录请求方法， url, 响应状态吗及执行时间
        // HEADER：除了BASIC中定义的信息之外
        // FULL: 除了HEADER中的还有请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
