/**
 * 文件名：UserNotify.java
 * <p>
 * Copyright 2019 重庆巽逸科技技术有限公司 版权所有.
 */
package com.xunyi.education.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *
 * @author zhuxin
 * @date 2020/4/23 22:18
 * @since 1.0.0
 */
@TableName("UserNotify")
@Data
public class UserNotify {
    private int id;
    private boolean isread;
    private int users;
    private Date createat;
}
