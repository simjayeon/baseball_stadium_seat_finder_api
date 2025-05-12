package com.kbo.baseball_stadium_seat_finder_api.domain.service;

import com.kbo.baseball_stadium_seat_finder_api.domain.entity.StadiumEntity;
import com.kbo.baseball_stadium_seat_finder_api.domain.enums.StadiumEnum;
import com.kbo.baseball_stadium_seat_finder_api.domain.repository.IStadiumRepository;
import com.kbo.baseball_stadium_seat_finder_api.interfaces.dto.response.ResStadiumList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StadiumService {

    private final IStadiumRepository stadiumRepository;

    public List<ResStadiumList> getStadiumList() {
        List<StadiumEntity> stadiumList = stadiumRepository.findAll();

        if (stadiumList.isEmpty()) {
            return List.of();
        }

        return stadiumList.stream()
                .map(stadium -> new ResStadiumList(StadiumEnum.from(stadium)))
                .toList();
    }
}
