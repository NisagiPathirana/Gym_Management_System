package edu.icet.model.dto;
import jdk.jfr.Name;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Payment {
    private String paymentId;
    private double amount;
    private LocalDate payDate;
}
