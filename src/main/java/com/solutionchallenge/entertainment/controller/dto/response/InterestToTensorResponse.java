package com.solutionchallenge.entertainment.controller.dto.response;

import com.solutionchallenge.entertainment.domain.senior.Senior;
import lombok.*;
import net.bytebuddy.matcher.FilterableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InterestToTensorResponse {
    private Long seniorId;
    private int[] strInterests;

    public static InterestToTensorResponse of(Long seniorId, int[] strInterests) {
        return InterestToTensorResponse.builder().seniorId(seniorId).strInterests(strInterests)
                .build();    }
}
