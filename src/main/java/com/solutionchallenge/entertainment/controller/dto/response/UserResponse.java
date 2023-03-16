package com.solutionchallenge.entertainment.controller.dto.response;

import com.solutionchallenge.entertainment.domain.senior.Senior;
import lombok.*;

@Builder
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponse {
    private String nickName;
    private String password;
    private Long userId;

    public static UserResponse of(String nickName,String password, Long userId) {
        return UserResponse.builder().nickName(nickName).password(password).userId(userId).build();

    }
}
