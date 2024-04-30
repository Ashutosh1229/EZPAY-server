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
@Document(collection = "adhaarDetail")
public class AdhaarDetail {
    @Id
    private String adhaarId;
    private Date dateOfBirth;
    private String firstName;
    private String lastName;
    private Address address;
    private String fatherName;
}
