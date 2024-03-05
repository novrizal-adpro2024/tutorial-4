package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.repository.PaymentRepository;
import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.model.Payment;
import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment addPayment(String paymentId, Order order, String method, Map<String, String> paymentData) {
        return null;
    }

    @Override
    public Payment setStatus(Payment payment, String status) {
        return payment;
    }

    @Override
    public Payment getPayment(String paymentId) {
        return null;
    }

    @Override
    public List<Payment> getAllPayments() {
        return null;
    }
}