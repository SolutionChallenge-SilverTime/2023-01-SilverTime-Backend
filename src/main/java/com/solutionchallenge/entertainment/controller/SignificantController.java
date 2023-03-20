package com.solutionchallenge.entertainment.controller;

import com.solutionchallenge.entertainment.controller.dto.request.SignificantRequest;
import com.solutionchallenge.entertainment.controller.dto.response.SignificantResponse;
import com.solutionchallenge.entertainment.service.SignificantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/significant")
@RequiredArgsConstructor
public class SignificantController {
    private final SignificantService significantService;
    @PostMapping("/send")
    public ResponseEntity<?> sendSignificant(@AuthenticationPrincipal String nickName,@Valid @RequestBody SignificantRequest significantRequest){
        significantService.create(nickName,significantRequest.toSeriveDto());
        return ResponseEntity.ok("send");
    }
    @GetMapping("/tutorSendingList")
    public ResponseEntity<?> turtorSendingList(@AuthenticationPrincipal String nickName) {
        List<SignificantResponse> significantResponse = significantService.tutorSendingList(nickName);
        return ResponseEntity.ok(significantResponse);
    }

    @GetMapping("/guardianReceiveList")
    public ResponseEntity<?> guardianReceiveList(@AuthenticationPrincipal String nickName) {
        List<SignificantResponse> significantResponses = significantService.guardianReceiveList(nickName);
        return ResponseEntity.ok(significantResponses);
    }

}
