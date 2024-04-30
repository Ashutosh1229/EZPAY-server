package org.ezpay.controller;
import org.ezpay.model.Account;
import org.ezpay.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.isNull;
import static org.ezpay.helper.Contants.*;

@RestController
@RequestMapping("accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/all")
    public ResponseEntity<Object> allAccounts(){
        try {
            List<Account> res = accountService.getAllAccounts();
            if(isNull(res) || res.isEmpty())
                return ResponseEntity.status(HttpStatus.OK).body(EMPTY_MESSAGE);
            return ResponseEntity.status(HttpStatus.OK).body(res);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
    @GetMapping("/account")
    public ResponseEntity<Object> getAccount(@RequestParam(name = "accountId") String id){
        try {
            Account res = accountService.getAccountDetail(id);
            if(isNull(res))
                return ResponseEntity.status(HttpStatus.OK).body(EMPTY_MESSAGE+":"+id);
            return ResponseEntity.status(HttpStatus.OK).body(res);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
    @GetMapping("/userAccount")
    public ResponseEntity<Object> getUserAccounts(@RequestParam(name = "userId") String userId){
        try {
            List<Account> res = accountService.getUserAccounts(userId);
            if(isNull(res) || res.isEmpty())
                return ResponseEntity.status(HttpStatus.OK).body(EMPTY_MESSAGE+":"+userId);
            return ResponseEntity.status(HttpStatus.OK).body(res);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
    @PostMapping("/add")
    public ResponseEntity<Object> addAccount(@RequestBody Account account){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(accountService.saveAccount(account));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
    @DeleteMapping("/account/delete")
    public ResponseEntity<Object> deleteAccount(@RequestParam(name = "accountId") String id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(accountService.deleteAccount(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
    @DeleteMapping("/user/delete")
    public ResponseEntity<Object> deleteUserAccounts(@RequestParam(name = "userId") String userId){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(accountService.deleteUserAccounts(userId));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
    @PutMapping("/modify")
    public ResponseEntity<Object> modifyAccount(@RequestBody Account account){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(accountService.modifyAccount(account));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ERROR_MESSAGE+": "+e);
        }
    }
}
