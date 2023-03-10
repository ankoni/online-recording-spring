package com.onlinerecord.model.dto;

import com.onlinerecord.model.User;
import lombok.*;

@Builder
@Data
public class UserDto {
    private String id;
    private String username;

    public static UserDto from(User user) {
        return builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }
}
