package org.ezpay.service;

import org.ezpay.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUser(String userId);
    public String saveUser(User user);
    public String deleteUser(String userId);
    public String modifyUser(User user);
}
