package com.framework.fixtures.addusers.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class UserData {
    private String userRole;
    private String employeeName;
    private String userName;
    private String roleStatus;
    private String password;
    private String message;
}
