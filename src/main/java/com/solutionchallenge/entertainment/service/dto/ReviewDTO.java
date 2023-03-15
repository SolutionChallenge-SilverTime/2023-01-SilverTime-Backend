package com.solutionchallenge.entertainment.service.dto;

import lombok.*;

@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {

    private Long seniorId;

    private Long lectureId;

    private String content;

    public static ReviewDTO of(Long seniorId, Long lectureId, String content){
        return new ReviewDTO(seniorId,lectureId,content);
    }
}
