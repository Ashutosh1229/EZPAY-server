package org.ezpay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "kycDetails")
public class KycDetail {
    @Id
    private String userId;
    private boolean autoKycStatus;
    private boolean manualKycStatus;
    private AdhaarDetail adhaarDetail;
}
