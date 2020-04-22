/**
 * 文件名：TestController.java
 * <p>
 * Copyright 2019 重庆若谷信息技术有限公司 版权所有.
 */
package com.xunyi.education.controller;

import com.xunyi.education.entity.RiskResult;
import com.xunyi.education.entity.User;
import com.xunyi.education.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private UserMapper userMapper;

    @ApiOperation("查询用户")
    @GetMapping("/user")
    public String test(){
        RiskResult riskResult = new RiskResult();
        User user = userMapper.selectById(1);

        return user.toString();
    }
}
