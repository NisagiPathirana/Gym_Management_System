package edu.icet.model.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserEntity {

    private String userId;
    private String name;
    private String password;
    private String role;

}
