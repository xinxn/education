/**
 * 文件名：TestController.java
 * <p>
 * Copyright 2019 重庆巽逸科技技术有限公司 版权所有.
 */
package com.xunyi.education.controller;

import com.xunyi.education.entity.RiskResult;
import com.xunyi.education.entity.UserNotify;
import com.xunyi.education.mapper.UserNotifyMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @author zhuxin
 * @date 2020/4/20 22:54
 * @since 1.0.0
 */
@Api(tags ="测试")
@RestController
@RequestMapping("/test")
public class TestController{

    @Resource
    private UserNotifyMapper userNotifyMapper;

    @ApiOperation("查询用户")
    @PostMapping("/user")
    public String test(@RequestBody Integer id){

        UserNotify userNotify =  userNotifyMapper.selectById(id);

        return userNotify.toString();
    }
}
