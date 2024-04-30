package org.ezpay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "accountDetails")
public class Account {
    @Id
    private String accountId;
    private String userId;
    private String bankName;
    private String ifscCode;
    private Date createdDate;
    private Date updatedDate;

}
