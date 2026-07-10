package com.skillfirstlab.swiggy.service;

import com.skillfirstlab.swiggy.entity.Payment;
import com.skillfirstlab.swiggy.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Create Payment
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Get All Payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Get Payment By Id
    public Payment getPaymentById(int id) {
        return paymentRepository.findById(id).orElse(null);
    }

    // Update Payment
    public Payment updatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Delete Payment
    public String deletePayment(int id) {
        paymentRepository.deleteById(id);
        return "Payment Deleted Successfully";
    }
}