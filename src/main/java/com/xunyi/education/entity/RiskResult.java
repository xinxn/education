/**
 * 文件名：RiskResult.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.xunyi.education.entity;

import lombok.Data;

/**
 *返回给信息中心的结果集
 * @author zhuxin
 * @date 2020/4/20 23:06
 * @since 1.0.0
 */
@Data
public class RiskResult {
    /**
     * 请求状态码
     */
    private Integer code;
    /**
     * 请求错误信息
     */
    private String message;
    /**
     * 结果集
     */
    private Object data;
}
