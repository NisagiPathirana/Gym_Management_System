package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {

    private String userId;
    private String name;
    private String password;
    private String role;
}
