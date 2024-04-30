package org.ezpay.repository;

import org.ezpay.model.AdhaarDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdhaarRepo extends MongoRepository<AdhaarDetail, String> {
}
