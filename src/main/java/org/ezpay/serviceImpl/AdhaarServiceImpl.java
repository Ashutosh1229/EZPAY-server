package org.ezpay.serviceImpl;

import org.ezpay.model.Account;
import org.ezpay.model.AdhaarDetail;
import org.ezpay.repository.AccountRepo;
import org.ezpay.repository.AdhaarRepo;
import org.ezpay.service.AccountService;
import org.ezpay.service.AdhaarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static java.util.Objects.isNull;
import static org.ezpay.helper.Contants.*;

@Service
public class AdhaarServiceImpl implements AdhaarService {

    @Autowired
    private AdhaarRepo adhaarRepo;
    @Override
    public List<AdhaarDetail> getAllAdhaarDetail() {
        return adhaarRepo.findAll();
    }

    @Override
    public AdhaarDetail getAdhaarDetail(String adhaarId) {
        return adhaarRepo.findById(adhaarId).orElse(null);
    }

    @Override
    public String saveAdhaar(AdhaarDetail adhaarDetail) {
        if(adhaarRepo.findById(adhaarDetail.getAdhaarId()).isPresent()){
            return ALREADY_EXISTS;
        }
        adhaarRepo.save(adhaarDetail);
        return adhaarDetail.getAdhaarId()+ADDED_MESSAGE;
    }

    @Override
    public String deleteAdhaar(String id) {
        if(!adhaarRepo.findById(id).isPresent()){
            return EMPTY_MESSAGE;
        }
        adhaarRepo.deleteById(id);
        return "Account ID: "+id+DELETE_MESSAGE;
    }

    @Override
    public String modifyAdhaar(AdhaarDetail adhaarDetail) {
        AdhaarDetail res = adhaarRepo.findById(adhaarDetail.getAdhaarId()).orElse(null);
        if(isNull(res)){
            return EMPTY_MESSAGE;
        }
        adhaarRepo.save(adhaarDetail);
        return adhaarDetail.getAdhaarId()+UPDATED_MESSAGE;
    }
}
