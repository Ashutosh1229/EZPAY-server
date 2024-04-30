package org.ezpay.serviceImpl;

import org.ezpay.model.Account;
import org.ezpay.repository.AccountRepo;
import org.ezpay.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static java.util.Objects.isNull;
import static org.ezpay.helper.Contants.*;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo accountRepo;
    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public List<Account> getUserAccounts(String userId) {
        return accountRepo.findByUserId(userId);
    }

    @Override
    public Account getAccountDetail(String id) {
        return accountRepo.findById(id).orElse(null);
    }

    @Override
    public String saveAccount(Account account) {
        if(accountRepo.findById(account.getAccountId()).isPresent()){
            return ALREADY_EXISTS;
        }
        account.setCreatedDate(new Date());
        accountRepo.save(account);
        return account.getAccountId()+ADDED_MESSAGE;
    }

    @Override
    public String deleteAccount(String id) {
        if(!accountRepo.findById(id).isPresent()){
            return EMPTY_MESSAGE;
        }
        accountRepo.deleteById(id);
        return "Account ID: "+id+DELETE_MESSAGE;
    }

    @Override
    public String deleteUserAccounts(String userId) {
        if(accountRepo.findByUserId(userId).isEmpty() || isNull(accountRepo.findByUserId(userId))){
            return EMPTY_MESSAGE;
        }
        accountRepo.deleteByUserId(userId);
        return "User ID: "+userId+DELETE_MESSAGE;
    }

    @Override
    public String modifyAccount(Account account) {
        Account res = accountRepo.findById(account.getAccountId()).orElse(null);
        if(isNull(res)){
            return EMPTY_MESSAGE;
        }
        account.setCreatedDate(res.getCreatedDate());
        account.setUpdatedDate(new Date());
        accountRepo.save(account);
        return account.getAccountId()+UPDATED_MESSAGE;
    }
}
