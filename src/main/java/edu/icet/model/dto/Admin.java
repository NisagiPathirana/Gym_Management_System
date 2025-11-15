package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Admin {
    private String adminId;
    private String adminName;
    private String email;
}
