package com.xunyi.education;

import com.xunyi.education.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EducationApplicationTests {

    @Resource
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
        redisUtil.set("phone","18223131589");

    }

}
