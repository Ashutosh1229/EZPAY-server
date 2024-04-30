package org.ezpay.service;

import org.ezpay.model.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAllAccounts();
    public List<Account> getUserAccounts(String userId);
    public Account getAccountDetail(String id);
    public String saveAccount(Account account);
    public String deleteAccount(String id);
    public String deleteUserAccounts(String userId);
    public String modifyAccount(Account account);
}
