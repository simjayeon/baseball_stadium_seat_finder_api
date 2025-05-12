package com.kbo.baseball_stadium_seat_finder_api.interfaces.controller;

import com.kbo.baseball_stadium_seat_finder_api.domain.service.StadiumService;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response.ResStadiumList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stadium")
@CrossOrigin(origins = "*")
public class StadiumController {
    private final StadiumService stadiumService;

    @GetMapping("")
    public List<ResStadiumList> getStadiumList() {
        return stadiumService.getStadiumList();
    }
}