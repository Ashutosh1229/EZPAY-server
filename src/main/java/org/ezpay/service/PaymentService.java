
package org.ezpay.service;

import org.ezpay.model.Payment;
import org.ezpay.model.User;

import java.util.List;

public interface PaymentService {
    public List<Payment> getAllPayments();
    public Payment getPayment(String paymentId);
    public String savePayment(Payment payment);
    public String deletePayment(String paymentId);
    public String modifyPayment(Payment payment);
}
