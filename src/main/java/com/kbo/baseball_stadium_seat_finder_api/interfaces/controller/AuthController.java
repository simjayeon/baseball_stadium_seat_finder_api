package com.kbo.baseball_stadium_seat_finder_api.interfaces.controller;

import com.kbo.baseball_stadium_seat_finder_api.domain.service.AuthService;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.request.ReqLoginDto;
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

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid ReqLoginDto reqDto) {
        return ResponseEntity.ok(authService.login(reqDto));
    }
}