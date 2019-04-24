package com.xkcoding.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.icetech.api.OssService;
import com.xkcoding.dubbo.common.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Hello服务API
 * </p>
 *
 * @package: com.xkcoding.dubbo.consumer.controller
 * @description: Hello服务API
 * @author: wangzw
 * @date: Created in 2018-12-25 17:22
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: wangzw
 */
@RestController
@Slf4j
public class HelloController {
    @Reference
    private HelloService helloService;
    @Reference
    private OssService ossService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(defaultValue = "xkcoding") String name) {
        log.info("i'm ready to call someone......");
        return helloService.sayHello(name);
    }

    @GetMapping("/oss")
    public String oss() {
        log.info("i'm ready to call someone......");
        return ossService.getImageUrl("mapp/photos/6.jpg");
    }
}
