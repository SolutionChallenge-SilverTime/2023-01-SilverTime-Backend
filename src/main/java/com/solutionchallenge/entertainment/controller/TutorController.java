package com.solutionchallenge.entertainment.controller;

import com.solutionchallenge.entertainment.controller.dto.request.TutorRequest;
import com.solutionchallenge.entertainment.controller.dto.response.UserResponse;
import com.solutionchallenge.entertainment.service.TutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth/tutor")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TutorController {
    private final TutorService tutorService;
    @PostMapping(value ="signup", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> signUp(@Valid @RequestPart TutorRequest tutorRequest, @RequestPart MultipartFile profileImage) throws Exception{
        tutorService.signUp(tutorRequest.toServiceDto(), profileImage);
        return ResponseEntity.ok("signup complete");
    }
    @GetMapping("/mypage/{userId}")
    public ResponseEntity<?> myPage(@PathVariable Long userId){
        UserResponse userResponse = tutorService.getMypage(userId);
        return ResponseEntity.ok(userResponse);
    }
}
