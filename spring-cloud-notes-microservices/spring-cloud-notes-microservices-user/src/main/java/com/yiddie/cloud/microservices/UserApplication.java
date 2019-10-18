package com.yiddie.cloud.microservices;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * title
 * description
 *
 * @author yiddie
 * @date 2019/10/18 4:22 下午
 */
@SpringBootApplication
@EnableSwagger2Doc
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
