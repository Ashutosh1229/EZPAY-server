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
@Document(collection = "customerDetails")
public class Customer {
    @Id
    private String email;
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private ContactNumber phoneNo;
}
