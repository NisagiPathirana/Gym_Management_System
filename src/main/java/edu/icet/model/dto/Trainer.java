package edu.icet.model.dto;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Trainer {

    private String trainerId;
    private String name;
    private String address;
    private double salary;
    private String phoneNumber;
    private String email;
    private LocalDate dob;
    private int experienceYear;
    private String qualification;
}
