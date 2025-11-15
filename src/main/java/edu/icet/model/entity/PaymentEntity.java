package edu.icet.model.entity;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PaymentEntity {
    private String paymentId;
    private double amount;
    private LocalDate payDate;
}
