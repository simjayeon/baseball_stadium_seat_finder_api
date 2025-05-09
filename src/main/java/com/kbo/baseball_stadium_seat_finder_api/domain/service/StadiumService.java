package com.kbo.baseball_stadium_seat_finder_api.domain.service;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.enums.StadiumEnum;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IStadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StadiumService {

    private final IStadiumRepository stadiumRepository;

    public ResponseEntity<?> getStadiumList() {
        List<StadiumEntity> stadiumList = stadiumRepository.findAll();

        if (stadiumList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(stadiumList.stream()
                .map(StadiumEnum::from)
                .toList());
    }
}
