package org.ezpay.repository;

import org.ezpay.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepo extends MongoRepository<Payment, String> {
}
