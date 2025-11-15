package edu.icet.model.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AdminEntity {

    private String adminId;
    private String adminName;
    private String email;
}
