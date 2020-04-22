/**
 * 文件名：TtResout.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.xunyi.education.entity;

import lombok.Data;

/**
 *
 * @author zhuxin
 * @date 2020/4/20 23:04
 * @since 1.0.0
 */
@Data
public class TtRequest {

    /**
     * 业务数据
     */
    private String data;
    /**
     * 签名
     */
    private String sign;

}
