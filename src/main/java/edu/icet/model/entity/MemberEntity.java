package edu.icet.model.entity;

import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MemberEntity {
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
