package com.javatechs.paymentservice.controller;

import com.javatechs.paymentservice.entity.Payment;
import com.javatechs.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping(value = "/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

    @GetMapping("/getPayment/{paymentId}")
    public Payment getPayment(@PathVariable("paymentId") int paymentId){
        return service.getPayment(paymentId);
    }

}
