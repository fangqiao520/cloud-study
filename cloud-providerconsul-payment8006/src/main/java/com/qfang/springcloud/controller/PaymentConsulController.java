package com.qfang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author qfang
 * @date 2023/4/14 - 15:35
 */
@RestController
@Slf4j
public class PaymentConsulController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentzk() {
        return "spring cloud with consul: " + serverPort + "\t" + UUID.randomUUID();
    }
}
