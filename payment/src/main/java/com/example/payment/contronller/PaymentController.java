package com.example.payment.contronller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private int myport;

    @GetMapping("/dopay/{orderid}")
    public ResponseEntity<String> paylogic(@PathVariable("orderid") Long orderid) {
        return ResponseEntity.ok("支付服务successful! orderid=" + orderid + ", 支付成功。 支付服务的端口为port=" + myport );
    }
}