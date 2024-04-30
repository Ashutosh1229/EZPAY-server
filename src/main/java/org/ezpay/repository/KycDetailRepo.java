package org.ezpay.repository;

import org.ezpay.model.KycDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KycDetailRepo extends MongoRepository<KycDetail, String> {
}
