package com.solutionchallenge.entertainment.controller.dto.request;

import lombok.*;

import java.util.List;

@Builder
@Getter
public class ModelInterestRequest {
    Long seniorId;
    List<Long> integers;
}
