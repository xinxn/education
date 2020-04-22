/**
 * 文件名：User.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.xunyi.education.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 * @author zhuxin
 * @date 2020/4/20 22:48
 * @since 1.0.0
 */
@TableName("user")
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
