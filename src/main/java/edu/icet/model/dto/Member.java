package edu.icet.model.dto;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Member {

    private String memberId;
    private String name;
    private String email;
    private String address;
    private LocalDate dob;
    private double BMI;
    private String phoneNumber;
    private double registrationFee;
    private double subscription;
}
