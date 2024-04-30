package org.ezpay.service;

import org.ezpay.model.AdhaarDetail;

import java.util.List;

public interface AdhaarService {
    public List<AdhaarDetail> getAllAdhaarDetail();
    public AdhaarDetail getAdhaarDetail(String adhaarId);
    public String saveAdhaar(AdhaarDetail adhaarDetail);
    public String deleteAdhaar(String adhaarId);
    public String modifyAdhaar(AdhaarDetail adhaarDetail);
}
