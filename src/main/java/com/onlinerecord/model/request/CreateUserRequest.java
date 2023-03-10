package com.onlinerecord.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateUserRequest {
    @NotBlank
    String name;

    @NotBlank
    String fullName;

    @NotBlank
    String password;

    @NotBlank
    String rePassword;

    Set<String> authorities;
}
