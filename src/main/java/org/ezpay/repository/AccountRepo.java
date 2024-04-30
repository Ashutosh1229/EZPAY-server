package org.ezpay.repository;

import org.ezpay.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepo extends MongoRepository<Account, String> {
    public List<Account> findByUserId(String userId);
    public void deleteByUserId(String userId);
}
