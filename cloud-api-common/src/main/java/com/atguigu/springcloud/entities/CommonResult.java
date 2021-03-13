package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回对象
 *
 * @author zzyy
 * @date 2020/2/18 10:24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //例如 404 NOT_FOUND
    private Integer code;
    private String message;
    private T data;

    /**
     * 只有编码和message的方法
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
