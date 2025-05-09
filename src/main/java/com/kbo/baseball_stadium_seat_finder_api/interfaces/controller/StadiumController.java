package com.kbo.baseball_stadium_seat_finder_api.interfaces.controller;

import com.kbo.baseball_stadium_seat_finder_api.domain.service.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stadium")
@CrossOrigin(origins = "*")
public class StadiumController {
    private final StadiumService stadiumService;

    @GetMapping("")
    public ResponseEntity<?> getStadiumList() {
        return ResponseEntity.ok(stadiumService.getStadiumList());
    }
}