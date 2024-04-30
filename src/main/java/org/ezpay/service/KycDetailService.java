package org.ezpay.service;

import org.ezpay.model.KycDetail;

import java.util.List;

public interface KycDetailService {
    public List<KycDetail> getAllKycDetails();
    public KycDetail getKycDetail(String userId);
    public String saveKycDetail(KycDetail kycDetail);
    public String deleteKycDetail(String userId);
    public String modifyKycDetail(KycDetail kycDetail);
}
