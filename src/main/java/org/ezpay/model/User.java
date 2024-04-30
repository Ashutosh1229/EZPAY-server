package org.ezpay.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "userDetails")
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private List<ContactNumber> contactNumbers;
    private Address address;
    private Integer pinCode;
    private String panCard;
    private List<Account> userAccounts;
    private KycDetail kycDetail;
}
