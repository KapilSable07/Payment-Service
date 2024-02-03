package com.javatechs.paymentservice.service;

import com.javatechs.paymentservice.entity.Payment;
import com.javatechs.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;
@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment pay){
        pay.setPaymentStatus(isPaymentProcessing());
        pay.setTranscationId(UUID.randomUUID().toString());
    return repository.save(pay);
    }

    public String isPaymentProcessing(){
        // third pary pament gatway call;
        return new Random().nextBoolean()?"Success":"Failed";
    }

    public Payment getPayment(int paymentId) {
        return repository.findById(paymentId).get();
    }

}
