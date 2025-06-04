package com.kbo.baseball_stadium_seat_finder_api.interfaces.controller;

import com.kbo.baseball_stadium_seat_finder_api.domain.service.AuthService;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request.ReqLoginDto;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request.ReqSignUpDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody @Valid ReqSignUpDto reqDto) {
        return ResponseEntity.ok(authService.signUp(reqDto));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid ReqLoginDto reqDto) {
        return ResponseEntity.ok(authService.login(reqDto));
    }

//    @PostMapping("/kakao-login")
//    public ResponseEntity<?> kakaoLogin(@RequestBody @Valid ReqLoginDto reqDto) {
//        return ResponseEntity.ok(authService.login(reqDto));
//    }
}