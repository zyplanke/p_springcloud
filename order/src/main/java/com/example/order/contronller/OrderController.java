package com.example.order.contronller;

import com.example.order.feignclients.IPaymentServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private IPaymentServiceClient paymentServiceClient;

    @GetMapping("/consumer/{orderid}")
    public ResponseEntity<String> consumerFeign(@PathVariable("orderid") Long orderid) {
        return ResponseEntity.ok ("调用订单模拟服务完成。 订单orderid:" + orderid + ",   调用返回的Body:" + paymentServiceClient.dodopay(orderid).getBody() );
    }
}
