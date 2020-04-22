package com.xunyi.education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author asus
 */
@SpringBootApplication
@MapperScan("com.xunyi.education.mapper")
public class EducationApplication {


    public static void main(String[] args) {
        SpringApplication.run(EducationApplication.class, args);
    }

}
