package org.ezpay.serviceImpl;

import org.ezpay.model.AdhaarDetail;
import org.ezpay.model.KycDetail;
import org.ezpay.repository.AdhaarRepo;
import org.ezpay.repository.KycDetailRepo;
import org.ezpay.service.AdhaarService;
import org.ezpay.service.KycDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;
import static org.ezpay.helper.Contants.*;

@Service
public class KycDetailServiceImpl implements KycDetailService {

    @Autowired
    private KycDetailRepo kycDetailRepo;
    @Override
    public List<KycDetail> getAllKycDetails() {
        return kycDetailRepo.findAll();
    }

    @Override
    public KycDetail getKycDetail(String userId) {
        return kycDetailRepo.findById(userId).orElse(null);
    }

    @Override
    public String saveKycDetail(KycDetail kycDetail) {
        if(kycDetailRepo.findById(kycDetail.getUserId()).isPresent()){
            return ALREADY_EXISTS;
        }
        kycDetailRepo.save(kycDetail);
        return kycDetail.getUserId()+ADDED_MESSAGE;
    }

    @Override
    public String deleteKycDetail(String id) {
        if(!kycDetailRepo.findById(id).isPresent()){
            return EMPTY_MESSAGE;
        }
        kycDetailRepo.deleteById(id);
        return "Account ID: "+id+DELETE_MESSAGE;
    }

    @Override
    public String modifyKycDetail(KycDetail kycDetail) {
        KycDetail res = kycDetailRepo.findById(kycDetail.getUserId()).orElse(null);
        if(isNull(res)){
            return EMPTY_MESSAGE;
        }
        kycDetailRepo.save(kycDetail);
        return kycDetail.getUserId()+UPDATED_MESSAGE;
    }
}
