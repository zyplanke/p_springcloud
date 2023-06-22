package com.example.order.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "paymentService")    // Feign客户端制定目标服务的名字（根据此名字从注册中心订阅具体的服务实例信息），另可通过contextId指定Bean名
public interface IPaymentServiceClient {

    @GetMapping("/dopay/{payid}")  // 目标服务(服务提供方）的内具体的调用URL路径
    public ResponseEntity<String> dodopay(@PathVariable("payid") Long payid);
}